import java.io.*;

class Directories{
    static String [] dirs = {"dir1","dir2"};
    public static void main(String[] args){
        for (String d:dirs){
            String path = d;
            //System.out.println(d);
            //System.out.println(File.separator+d);
            File file = new File(path, args[0]);
            System.out.print(file.exists()+" ");
        }
        System.out.println();
    }
}
