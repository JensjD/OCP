import java.nio.file.*;

//copy move delete
public class CMD{
    public static void main(String[] args){
        Path source1 = Paths.get("cmd/test1.txt");
        Path source2 = Paths.get("cmd/test2.txt");
        Path target = Paths.get("cmd/test12.txt");
        try{
            Files.copy(source1,target);
            Files.copy(source1,target);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
