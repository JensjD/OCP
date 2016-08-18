public class Reader2 extends Thread{
    Calculator c;

    public Reader(Calculator calc){
        c=calc;
    }

    public void run(){
        synchronized(c){
            try{
                System.out.println("Waiting for calculation...");
                if(!c.isCalculated)
                    c.wait();
            }catch(InterruptedException e){}
            System.out.println("Total is: "+c.total);
        }
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        new Reader(calc).start();
        new Reader(calc).start();
        new Reader(calc).start();
        new Thread(calc).start();
    }
}
class Calculator implements Runnable{
    int total;
    boolean isCalculated = false;

    public void run(){
        synchronized(this){
            for(int i =0; i<100; i++){
                total+=i;
            }
            isCalculated = true;
            notifyAll();
        }
    }
}
