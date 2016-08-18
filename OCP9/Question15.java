import java.nio.file.*;

public class Question15{
    public static void main(String[] args)throws Exception{
        Path dir = Paths.get("dirx");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.txt")){
            for(Path p:stream)
                System.out.println(p);
        }
    }
}
