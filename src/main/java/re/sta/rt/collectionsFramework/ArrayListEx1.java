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

        System.out.println("al.containAll(al2) :  " + al.containsAll(al2));

        al2.add("B"); // 열 맨 뒤에 추가되서 붙게된다.
        al2.add("C");
        al2.add(3, "A"); // index 위치에 맞게, 지정된 객체에 저장하게된다.

        print(al, al2);

        al2.set(3, "AA"); // 주어진 객체(element) 를 지정된 위치(index)에 저장한다.
        print(al, al2);

        // al 에서 al2 와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("al.retainAll(al2) : " + al.retainAll(al2));

        print(al, al2);

        // al2에서 al에 포함된 객체들을 삭제한다.
        System.out.println("al2의 사이즈 : " + al2.size());
        for(int i = al2.size()-1; i >= 0; i--) { // i = 5 , 5->4->3->2->1->0/ 6번 for 문이 돌 예정.
            if(al.contains(al2.get(i))) // contains ? 지정된 객체가 ArrayList 에 포함되어 있는지 확인한다.
                al2.remove(i);
        }
        print(al, al2);

        System.out.println();
        System.out.println("--test--");
        System.out.println();

        for(int i = 0; i <= al2.size()-1; i++) {
            if(al.contains(al2.get(i)))
                al2.remove(i);
        }
        // * 여기서, for 문의 변수 i를 0부터 증가시킨 것이 아니라, 'list2.size()-1'부터 감소시키면서 거꾸로 반복시켰다.
        /*
               만일 변수 i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동을
               하기 때문에 올바른 결과를 얻을 수 없다.

               그래서, 제어변수를 감소시켜가면서 삭제를 해야 자리이동이 발생해도 영향을 받지 않고 작업이 가능하다.
         */

        print(al, al2);

    }
}
