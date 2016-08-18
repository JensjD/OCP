import java.io.*;

public class SearchFile{
    public static void main(String[] args){
        String[] files;
        File search = new File("newdir");
        files=search.list();

        for(String f:files)
            System.out.println("found: "+f);
    }
}
