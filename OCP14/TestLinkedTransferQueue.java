import java.util.concurrent.*;
public class TestLinkedTransferQueue{
    public static void main(String[] args){
        TransferQueue<Integer> tq = new LinkedTransferQueue<>();
        boolean b1 = tq.add(1);
        System.out.println(b1);
        System.out.println(tq.poll());
   //     tq.put(2);
    
    }
}
