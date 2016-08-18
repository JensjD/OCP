class BigOuter{
    static class Nest{ void go(){ System.out.println("hey nest");}}
    class Reg{ void go(){ System.out.println("hey reg");}}
}
class Broom{
    static class B2{ void go(){ System.out.println("hey b2");}}
    public static void main(String[] args){
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();
        BigOuter.Reg r = new BigOuter().new Reg();
        r.go();
        B2 b = new B2();
        b.go();
    }
}
