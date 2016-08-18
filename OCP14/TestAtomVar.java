import java.util.concurrent.atomic.AtomicInteger;
/*
class Counter{
    private int count;
    public void increment(){
        synchronized(this){
            count++;
        }
    }
    public int getValue(){
        return count;
    }
}
*/
class Counter{
    private AtomicInteger count = new AtomicInteger();
    public void increment(){
        count.getAndIncrement();
    }
    public int getValue(){
        return count.intValue();
    }
}
class IncrementerThread extends Thread{
    private Counter counter;
    public IncrementerThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for(int i = 0; i<10000; i++){
            counter.increment();
        }
    }
}
public class TestAtomVar{
    public static void main(String[] args){
        Counter counter = new Counter();    //the shared object
        IncrementerThread it1 = new IncrementerThread(counter); 
        IncrementerThread it2 = new IncrementerThread(counter); 
        it1.start();
        it2.start();
        try{
            it1.join();
            it2.join();
        }catch(Exception e){}
        System.out.println(counter.getValue());
    }
}
