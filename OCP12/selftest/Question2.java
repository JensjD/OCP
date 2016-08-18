class Boo{
    Boo(String s){}
    Boo() {}
    void print(){
        System.out.println("cool");
    }
}

class Bar extends Boo{
    Bar(){}
    Bar(String s){super(s);}
    void zoo(){
        //Boo f = new Boo(){}; 
        Boo f = new Boo(){
            void print(){
                System.out.println("anon cool");
            }
        };
        f.print();
    }
}

public class Question2{
    public static void main(String[] args){
        Bar b = new Bar();
        b.zoo();
    }
}
