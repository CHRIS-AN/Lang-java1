package re.sta.rt.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;




public class ArrayListEx1 {

    static void print(ArrayList al, ArrayList al2) {
        System.out.println("al : " + al);
        System.out.println("al2 : " + al2);
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList al = new ArrayList(10);

        al.add(5);
        al.add(4);
        al.add(2);
        al.add(0);
        al.add(1);

        ArrayList al2 = new ArrayList(al.subList(1,4));

        print(al, al2);

        Collections.sort(al); // al과 al2 를 정렬한다.
        Collections.sort(al2); // Collection.sort(List 1)

        print(al, al2);

        System.out.println("al.containAll(al2)" + al.containsAll(al2));

        al2.add("B");
        al2.add("C");
        al2.add(3, "A");
        print(al, al2);
    }
}
