import java.io.*;

public class ExistingFile{
    public static void main(String[] args){
        try{
            File existingD = new File("mydir");
            System.out.println(existingD.isDirectory());

            File existingDF = new File(existingD,"myFile.txt");
            System.out.println(existingDF.isFile());

            FileReader fr = new FileReader(existingDF);
            BufferedReader br = new BufferedReader(fr);

            String s;
            while((s=br.readLine())!=null)
                System.out.println(s);
            br.close();
        }catch(Exception e){}
    }
}
