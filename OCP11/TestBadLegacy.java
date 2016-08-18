import java.util.*;
public class TestBadLegacy{
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(6);
        Inserter in = new Inserter();
        in.insert(myList);
        //for(Integer i: myList)
          //  System.out.println(i);
    }
}
class Inserter{
    void insert(List list){
        list.add(new String("42"));
    }
}
