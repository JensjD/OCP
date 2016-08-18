import java.util.regex.*;

class RegTest{
    public static void main(String[] args){
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);

        System.out.println("\nsource: "+args[1]);
        System.out.println(" index: 01234567890123456\n");
        System.out.println("expression: "+m.pattern());
        System.out.print("match positions: ");
        while(m.find())
            System.out.print(m.start()+" "+m.group());
        System.out.println("");

    }
}
