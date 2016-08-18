import java.nio.file.*;
//import java.nio.file.attribute.*;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
//import java.io.IOException;

public class MyWatchService {
    public static void main(String[] args) throws Exception{
        
        Path dir = Paths.get("src");
        WatchService watcher = FileSystems.getDefault().newWatchService();
        dir.register(watcher, ENTRY_DELETE);

        while(true){
            WatchKey key;
            try{
                key = watcher.take();
            }catch (InterruptedException x){
                return;
            }
            for(WatchEvent<?> event : key.pollEvents()){
                WatchEvent.Kind<?> kind = event.kind();
                System.out.println(kind.name());
                System.out.println(kind.type());
                System.out.println(event.context());
                String name = event.context().toString();
                if( name.equals("directoryToDelete")){
                    System.out.println("Directory deleted, noew we can proceed");
                    return;
                }
            }
            key.reset();
        }
    }
}
