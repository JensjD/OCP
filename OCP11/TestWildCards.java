import java.util.*;

public class TestWildCards{
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        Bar bar = new Bar();
        bar.doInsert(myList);
    }
}
class Bar{
    void doInsert(List<Object> list){
        list.add(new Dog());
    }
}
class Dog{}
