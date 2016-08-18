import java.util.Locale;
import java.util.ResourceBundle;

public class WhichLanguage {
    public static void main (String[] args) {
        Locale locale = new Locale(args[0],"CA");
        ResourceBundle rb = ResourceBundle.getBundle("Labels",locale);
        System.out.println(rb.getObject("hello"));
    }
}
