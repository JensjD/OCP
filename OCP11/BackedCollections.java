import java.util.*;

public class BackedCollections{
    public static void main(String[] args){
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a","ant"); map.put("d","dog"); map.put("h","horse");

        SortedMap<String, String>submap = map.subMap("b","g");

        System.out.println(map+" "+submap);

        map.put("b","bat");
        submap.put("f","fish");

        map.put("r","raccoon");
        //submap.put("p","pig");

        System.out.println(map+" "+submap);
    }
}

