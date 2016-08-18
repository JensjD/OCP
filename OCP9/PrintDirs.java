import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class PrintDirs extends SimpleFileVisitor<Path>{
    
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        System.out.println("pre: "+dir);
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println("file: "+file);
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult visitFileFailed(Path file, IOException exc){
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("post: "+dir);
        return FileVisitResult.CONTINUE;
    }



    public static void main(String[] args){
        try{
            //////////////
            Path relative = Paths.get("src");
            System.out.println("> "+relative+"\n");
            //////////////

            PrintDirs dirs = new PrintDirs();
            Files.walkFileTree(Paths.get("src"),dirs);
        }catch (Exception e){}
        System.out.println("\ndone");
    }
}
