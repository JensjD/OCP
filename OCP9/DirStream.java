import java.nio.file.*;

public class DirStream{
    public static void main(String[] args) throws Exception{
        Path dir = Paths.get("/./Users");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "[j]*")){
            for(Path path : stream)
                System.out.println(path.getFileName());
        }
    }
}
