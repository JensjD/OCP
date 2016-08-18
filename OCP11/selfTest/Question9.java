import java.util.*;

public class Question9{
    public static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("2");
        pq.add("4");
        System.out.print("a> " + pq.peek() + " ");
        pq.offer("1");
        pq.add("3");
        pq.remove("1");
        System.out.print("b> " + pq.poll() + " ");
        if(pq.remove("2")) System.out.print("c> " + pq.poll() + " ");
        System.out.println("d>" + pq.poll() + " " + pq.peek());
    }
}
