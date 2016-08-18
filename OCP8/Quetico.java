import java.util.regex.*;
class Quetico{
    public static void main(String[] args){
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        System.out.print("match positions: ");
        while(m.find()){
            System.out.print(m.start()+" ");
        }
        System.out.println();
    }
}
