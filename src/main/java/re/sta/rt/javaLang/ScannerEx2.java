package re.sta.rt.javaLang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println(sum);
        System.out.println((double) sum/cnt);
    }
}
