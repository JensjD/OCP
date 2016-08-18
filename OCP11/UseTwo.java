public class UseTwo<T,X>{
    T one;
    X two;
    UseTwo(T one, X two){
        this.one=one;
        this.two=two;
    }
    T getT(){return one; }
    X getX(){return two; }
    
    public static void main(String[] args){
        UseTwo<String,Integer> twos = new UseTwo<>("abc",42);
        String a = twos.getT();
        int b = twos.getX();
        System.out.println(a+b);
    }
}
