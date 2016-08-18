import java.nio.file.*;

public class CreateFile{
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("f.txt");
        System.out.println(Files.exists(path));
        Files.createFile(path);
        System.out.println(Files.exists(path));
    }
}
