import java.util.*;
public class Canada{
    public static void main(String[] args){
        ResourceBundle rb = ResourceBundle.getBundle("Flag", new Locale("en_ca"));
        System.out.println(rb.getString("key"));
    }
}
