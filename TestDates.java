import java.util.Date;

public class TestDates{
    public static void main(String[] args){
        Date d1 = new Date();
        System.out.println("1st date: "+d1.toString());
        System.out.println(d1.getTime());
        d1.setTime(d1.getTime()+3600000);
        System.out.println("new date: "+d1.toString());

    }
}
