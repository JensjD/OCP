import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class RemoveClassFile extends SimpleFileVisitor<Path>{
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
        if(file.getFileName().endsWith(".class"))
            Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args){
        try{
            //////////////
            Path relative = Paths.get("src");
            System.out.println("> "+relative);
            //////////////

            RemoveClassFile dirs = new RemoveClassFile();
            Files.walkFileTree(Paths.get("OCP9/src"),dirs);
        }catch (Exception e){}
        System.out.println("done");
    }
}
