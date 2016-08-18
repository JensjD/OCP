import java.util.*;
public class NameList{
    private List names = Collections.synchronizedList(new LinkedList());
    public void add(String name){
        names.add(name);
    }
    public String removeFirst(){
        if(names.size()>0)
            return (String) names.remove(0);
        else
            return null;
    }


    //main
    public static void main(String[] args){
        final NameList n1 = new NameList();
        n1.add("Ozymandias");
        class NameDropper extends Thread{
            public void run(){
                String name = n1.removeFirst();
                System.out.println(name);
            }
        }
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        t1.start();
        t2.start();

    }
}
