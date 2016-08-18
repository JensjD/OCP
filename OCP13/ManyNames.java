class NameRunnable implements Runnable{
    public void run(){
        for(int x=1; x<=3; x++){
            System.out.println("Run by " + Thread.currentThread().getName()
                +", x is " + x);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
        }
    }
}

public class ManyNames{
    public static void main(String[] args){
        //Make one Runnable
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("1-Fred");
        two.setName("2-Lucy");
        three.setName("3-Ricky");
        one.start();
        two.start();
        three.start();
        System.out.println("done");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){}
        System.out.println("done again");

    }
}
