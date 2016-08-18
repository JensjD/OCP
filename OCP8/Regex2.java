import java.util.regex.*;
class Regex2 {
    public static void main(String[] args){
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        boolean b = false;
        while(b=m.find()){
            System.out.print("s"+m.start()+"g"+m.group()+"  ");
        }
    }
}
