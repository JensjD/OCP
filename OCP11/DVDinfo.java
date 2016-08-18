import java.io.*;
import java.nio.file.*;
import java.util.*;
public class DVDinfo implements Comparable<DVDinfo> {
    String title;
    String genre;
    String leadActor;
    DVDinfo(String t, String g, String a){
        title=t; genre=g; leadActor=a;
    }
    public String toString(){
        return ">"+title+"*"+genre+"*"+leadActor+"<\n";
    }
    public int compareTo(DVDinfo d){
        return title.compareTo(d.getTitle());
    }

    public String getTitle(){return title;}
    public String getGenre(){return genre;}

    public static List<DVDinfo> populateList() {
        List<DVDinfo> dvdList = new ArrayList<>();
        Path file = Paths.get("dvdinfo.txt");
        DVDinfo temp;

        System.out.println(file);
        try(BufferedReader reader = Files.newBufferedReader(file)){
            String line=null;
            while((line=reader.readLine())!=null){
                String[] data = line.split("/");
                temp=new DVDinfo(data[0],data[1],data[2]);
                dvdList.add(temp);
                System.out.println(line);
            }
        }catch(IOException x){}

        return dvdList;
    }
    public static void main(String[] args){
        List<DVDinfo> dvdList = new ArrayList<>();
        dvdList=populateList();
        System.out.println("=========");
        System.out.println(dvdList);
        Collections.sort(dvdList);
        System.out.println(dvdList);
        GenreSort gs = new GenreSort();
        Collections.sort(dvdList,gs);
        System.out.println(dvdList);
    }
}
