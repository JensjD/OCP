import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

class DateTwo{
    public static void main(String[] args){
        Date d = new Date(1119280000000L);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
        System.out.println(df.format(d));
    }
}
