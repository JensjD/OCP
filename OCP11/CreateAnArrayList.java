import java.util.*;
public class CreateAnArrayList{
    public <T> void makeArrayList(T t){
        List<T> list = new ArrayList<T>();
        list.add(t);
        System.out.println(list.get(0));
    }
    public static void main(String[] args){
        CreateAnArrayList c = new CreateAnArrayList();
        c.makeArrayList(new Dog());
        System.out.println("done");
    }
}
class Dog{}
