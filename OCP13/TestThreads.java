class MyThread extends Thread{
    public void run(){
        System.out.println("Important job running in MyThread");
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Important job running in MyRunnable");
    }
}
public class TestThreads{
    public static void main(String[] args){
        MyThread t = new MyThread();


        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
