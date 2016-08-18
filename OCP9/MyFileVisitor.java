

public class MyFileVisitor extends SimpleFileVisitor<Path>{
    
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) 
            throws IOException {
        System.out.println("File: "+file);
        if (file.getFileName().endsWith("Test.java")){
        
        }
        return FileVisitResult.CONTINUE;
    }
}
