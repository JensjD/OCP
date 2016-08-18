import java.nio.file.*;

public class question6{
    public static void main(String[] args){
        Path one = Paths.get("dirx");
        Path two = Paths.get("dirx/diry/a.txt");
        System.out.println(one);
        System.out.println(two);
        System.out.println(one.relativize(two));


    }
}
