public class Thing {
    private static int staticField;
    private int nonstaticField;
    public static synchronized int getStaticField(){
        return staticField;
    }
    public static synchronized void setStaticField(int staticField){
        Thing.staticField = staticField;
    }
    public synchronized int getNonstaticField(){
        return nonstaticField;
    }
    public synchronized void setNonstaticField(int nonstaticField){
        this.nonstaticField = nonstaticField;
    }


    ///main
    public static void main(String[] args){
        myRun tt = new myRun();
        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt);
        Thread t3 = new Thread(tt);
        Thread t4 = new Thread(tt);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class myRun implements Runnable{
    @Override
    public void run(){
        Thing tt = new Thing();
        tt.setNonstaticField(10);
        int incre = tt.getNonstaticField()+1;
        Thing.setStaticField(incre);
        System.out.println(tt.getNonstaticField());
        System.out.println(Thing.getStaticField());
    }
}
