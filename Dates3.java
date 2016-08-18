import java.text.*;
import java.util.*;

class Dates3{
    public static void main(String[] args){
        Date d = new Date();
        DateFormat[] df = new DateFormat[6];
        df[0]=DateFormat.getInstance();
        df[1]=DateFormat.getDateInstance();
        df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
        df[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4]=DateFormat.getDateInstance(DateFormat.LONG);
        df[5]=DateFormat.getDateInstance(DateFormat.FULL);
        
        for(DateFormat dd: df)
            System.out.println(dd.format(d));

        System.out.println("=========");
        //////////////
        Date d2 = new Date();
        System.out.println("d2 = "+d2.toString());

        DateFormat dff = DateFormat.getDateInstance(DateFormat.SHORT);

        String s = dff.format(d2);
        System.out.println(s);
        
        try{
            Date d3 = dff.parse(s);
            System.out.println("parsed = "+d3.toString());
            Date d4 = dff.parse("ad");
        }catch(ParseException pe){
            System.out.println("parse excep: "+ pe);
        }

    }
}
