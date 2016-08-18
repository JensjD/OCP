import java.util.concurrent.*;
class MyCallable implements Callable<Integer>{
    @Override
    public Integer call(){
        int i = 10;
        return i;
    }
}

public class TestCallable{
    public static void main(String[] args){
        Callable<Integer> c = new MyCallable();
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> f = ex.submit(c);
        try{
            Integer v = f.get();
            System.out.println("Ran: " + v);
        }catch(InterruptedException | ExecutionException iex){
            System.out.println("Failed");
        }
        ex.shutdown();
    }
}
