import java.util.Scanner;
class User extends Thread{
    Machine machine;//need to init
    public User(){
        machine = new Machine();
    }

    public void run(){
        while(true){
            System.out.println("Enter commands: ");
            Scanner scan = new Scanner(System.in);
            String job = scan.next();
            System.out.println("adding jobs to machine");
            machine.addJob(job);
            }
        }
    }
    
}
class Machine extends Thread{
    List<String> jobs = new ArrayList<>();
    public void addJob(String job){
        synchronized(jobs){
            jobs.add(job);
            jobs.notify();
        }
    }

    public void run(){
        while(jobs.isEmpty()){
            synchronized(jobs){
                try{
                    user.wait();
                }catch(InterruptedException ie){}
                System.out.println("sending machine steps to hardware");
            }   
        }
    }
    
}

public class TestThreadNotify{
    public static void main(String[] args){
        Machine m = new Machine();
        System.out.println("starting machine");
        m.start();
        //System.out.println("initizalier thread done");
        
    }

}
