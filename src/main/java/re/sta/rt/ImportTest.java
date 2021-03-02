package re.sta.rt;


import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.System.out;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");


        System.out.println(dateFormat.format(today));
        System.out.println(time.format(today));
        out.println(time.format(today));
    }
}
