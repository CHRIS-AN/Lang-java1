package re.sta.rt.javaLang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(17);// 빇;ㅇ
        System.out.println(num);
        int n = num.intValue();// 언박싱
        System.out.println(n);


        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(0));

        System.out.println("■■■■■■■■■■■■■■■■■■■");

        String [][] str2D = new String[][]{{"aaa, bbb"}, {"AAA","BBB"}};
        String [][] str2D_2 = new String[][]{{"xxx, bbb"}, {"CCC","BBB"}};

        for(String [] tmp : str2D)
            System.out.println(Arrays.toString(tmp));
    }
}
