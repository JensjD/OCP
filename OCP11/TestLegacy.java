import java.util.*;

public class TestLegacy{
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();

        myList.add(4);
        myList.add(6);
        Adder adder = new Adder();
        int total = adder.addAll(myList);
        System.out.println(total);
    }
}
class Adder{
    int addAll(List list){
        Iterator it = list.iterator();
        int total = 0;
        while(it.hasNext()){
            int i = ((Integer)it.next()).intValue();
            total+=i;
        }
        return total;
    }
}
