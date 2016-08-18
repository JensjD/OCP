class MyOuter{
    private int x = 7;
    public void makeInner(){
        MyInner in = new MyInner();
        in.seeOuter();
    }
    class MyInner{
        public void seeOuter(){
            System.out.println("Outer x is: "+x);
            System.out.println("Inner class ref is "+this);
            System.out.println("Outer class ref is "+MyOuter.this);

        }
    }
    void doStuff(){
        String z="local variable";
        class Inner2{
            public void seeOuter(){
                System.out.println("Outer x is: "+x);
                System.out.println("Local var z is: "+z);
            }
        }
        Inner2 in2 = new Inner2();
        z="asdfasdfas";
        in2.seeOuter();
    }
}

public class TestOuter{
    public static void main(String[] args){
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
        MyOuter outer = new MyOuter();
        outer.doStuff();
    }
}
