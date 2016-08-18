import java.io.*;

public class Talker{
    public static void main(String[] args){
        Console c = System.console();
        String u = c.readLine("%s","username: ");
        System.out.println("hello " + u);
        char[] pw ;
        if(c != null & (pw = c.readPassword("%s","password: "))!= null){
            System.out.println("password accepted");
            System.out.println(u);
            System.out.print(pw);
        }
        System.out.print(pw);
        System.out.println();
    }
}
