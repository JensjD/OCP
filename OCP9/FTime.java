import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class FTime{
    public static void main(String[] args){
        try{
            Date janFirst = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();
            File file = new File("file");
            file.createNewFile();
            file.setLastModified(janFirst.getTime());
            System.out.println(file.lastModified());
            file.delete();

            Path path = Paths.get("file");
            Files.createFile(path);
            FileTime fileTime = FileTime.fromMillis(janFirst.getTime());
            Files.setLastModifiedTime(path,fileTime);
            System.out.println(Files.getLastModifiedTime(path));
            Files.delete(path);
        }catch(Exception e){}
    }
}
