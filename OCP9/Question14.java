import java.nio.file.*;

public class Question14{
    public static void main(String[] args){
        Path a = Paths.get("c:temp/dir/a.txt");
        Path b = Paths.get("c:temp/dir/subdir/b.txt");
        PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:**.txt");
        System.out.println(pm.matches(a));
        System.out.println(pm.matches(b));
    }
}
