import java.io.*;
public class Test{
    public static void main(String[] args){
        try{
            File file = new File("fileABC.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println("giggidy");
            pw.println("goop");
            //pw.flush();
            pw.close();

            File f = new File("fileABC.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            System.out.println(data);

        }catch(IOException e){
        }
    }
}
