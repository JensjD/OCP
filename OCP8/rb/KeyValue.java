package rb;
import java.util.*;
public class KeyValue{
    public static void main(String[] args){
        ResourceBundle rb = ResourceBundle.getBundle("rb.Bundle",Locale.getDefault());
        Object obj = rb.getObject("123");
        System.out.println(obj);
    }
}
