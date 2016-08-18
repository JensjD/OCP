import java.io.File;

class Maker{
    public static void main(String[] args){
        try{
            File dir3 = new File("dir3");
            dir3.mkdir();
            File file3 = new File("dir3","files3");
            file3.createNewFile();
        }catch(Exception e){}
    }
}
