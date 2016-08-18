public class MyWonderfulClass{
    void go(){
        Bar b = new Bar();
        b.doStuff(new Foo(){
            public void foof(){
                System.out.println("foofy");
            }
        });
    }
    public static void main(String[] args){
        MyWonderfulClass m = new MyWonderfulClass();
        m.go();
    }
}
interface Foo{
    void foof();
}

class Bar{
    void doStuff(Foo f){
        Foo a = f;
        a.foof();
        System.out.println("done");
    }
}
