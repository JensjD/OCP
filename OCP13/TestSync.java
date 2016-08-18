class myRun implements Runnable{
    StringBuffer str;
    public myRun(StringBuffer str){
        this.str=str;
    }

    public void run(){
        synchronized(str){
            for(int i=0;i<100;i++){
                System.out.print(str);
            }
            System.out.println();
            char next = str.charAt(0);
            next++;
            str.replace(0,1,String.valueOf(next));
        } 
    }
}

public class TestSync{
    public static void main(String[] args){
        myRun mr = new myRun(new StringBuffer("A"));
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        Thread t5 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
