import java.nio.file.*;
import java.nio.file.attribute.*;

public class BFAttributes{
    public static void main(String[] args){
        try{
            Path path = Paths.get("f.txt");
            BasicFileAttributes basic = Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(basic.creationTime());
            System.out.println(basic.lastAccessTime());
            System.out.println(basic.lastModifiedTime());
            System.out.println(basic.isDirectory());

            FileTime lastUpdated = basic.lastModifiedTime();
            FileTime created = basic.creationTime();
            FileTime now = FileTime.fromMillis(System.currentTimeMillis());
            BasicFileAttributeView basicView = Files.getFileAttributeView(path,BasicFileAttributeView.class);
            basicView.setTimes(lastUpdated,now,created);

            basic = Files.readAttributes(path,BasicFileAttributes.class);
            System.out.println(basic.creationTime());
            System.out.println(basic.lastAccessTime());
            System.out.println(basic.lastModifiedTime());
            System.out.println(basic.isDirectory());

        }catch(Exception e){}
    }
}
