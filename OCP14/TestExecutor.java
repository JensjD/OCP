import java.util.concurrent.Executor;
class SameThreadExecutor implements Executor{
    public void execute(Runnable cmd){
        cmd.run();
    }
}

class NewThreadExecutor implements Executor{
    public void execute(Runnable cmd){
        Thread t = new Thread(cmd);
        t.start();
    }
}
class MyRunnableTask implements Runnable{
    public void run(){
        System.out.println("run");
    }
}
public class TestExecutor{
    public static void main(String[] args){
        Runnable r = new MyRunnableTask();
        Executor ex = new NewThreadExecutor();
        ex.execute(r);
        Executor ex2 = new SameThreadExecutor();
        ex2.execute(r);
        System.out.println("===");
        Runtime rt = Runtime.getRuntime();
        int cpus = rt.availableProcessors();
        System.out.println(cpus);
    }
}
