import java.util.*;

public class Test implements Comparable<Test>{
    private String name;
    public Test(String name){
        this.name = name;
    }
    public String getName(){ return name; } 


    public int compareTo(Test t){
        return name.compareTo(t.getName());
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args){
        Test a = new Test("z");
        Test b = new Test("c");
        Test c = new Test("c");
        Test d = new Test("d");
        TreeSet<Test> mySet = new TreeSet<>();
        mySet.add(a);
        mySet.add(b);
        mySet.add(c);
        mySet.add(d);
        for(Test t:mySet)
            System.out.println(t);
    }
}
