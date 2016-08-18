import java.util.*;

class GenreSort implements Comparator<DVDinfo>{
    public int compare(DVDinfo one, DVDinfo two){
        return one.getGenre().compareTo(two.getGenre());
    }
}
