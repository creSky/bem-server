
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
         String a = "2018-05-15T24:59:59.000+0800";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date parse = simpleDateFormat.parse(a);
        System.out.println(parse.toString());
    }
}
