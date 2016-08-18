import java.nio.file.*;
import java.util.*;
import java.nio.file.attribute.*;


public class PosixFileAtt{
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("test.txt");
        Files.createFile(path);
        PosixFileAttributes posix =Files.readAttributes(path,PosixFileAttributes.class);
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
        Files.setPosixFilePermissions(path,perms);
        System.out.println(posix.permissions());
        System.out.println(posix.group());
    }
}
