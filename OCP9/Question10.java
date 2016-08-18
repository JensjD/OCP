import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class Question10{
    public void read(Path dir) throws IOException{
        PosixFileAttributes attr = Files.readAttributes(dir, PosixFileAttributes.class);
        System.out.println(attr.creationTime());
    }
}
