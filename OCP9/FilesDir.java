import java.io.*;
public class FilesDir{
    public static void main(String[] args){
        try{
            File myDir = new File("mydir");
            myDir.mkdir();

            File myFile = new File(myDir, "myFile.txt");
            myFile.createNewFile();

            PrintWriter pw = new PrintWriter(myFile);
            pw.println("new stuff");
            pw.println("asdf stuff");
            pw.close();
        }catch(Exception e){}
    }
}
