import java.util.regex.*;

public class Archie{
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        int count = 0;
        while(m.find()){
            count++;
            System.out.println(m.group());
        }
        System.out.println(count);
    }
}
