import java.util.*;
class Dog{
    public String name;
    public Dog(String n){name = n;}
    public boolean equals(Object o){
        if((o instanceof Dog) && (((Dog)o).name==name)){
            return true;
        }else{
            return false;
        }
    }
    public int hashCode(){return name.length();}
}
class MapTest{
    public static void main(String[] args){
        Map<Object, Object> m = new HashMap<>();
        Dog d = new Dog("Clover");
        m.put(d,"Dog key");
        m.put("key","value");

        d.name="Magnolia";
        System.out.println(m.get(d));
        d.name="Clover";
        System.out.println(m.get(new Dog("Clover")));
        d.name="Arthur";
        System.out.println(m.get(new Dog("Clover")));
    }
}
