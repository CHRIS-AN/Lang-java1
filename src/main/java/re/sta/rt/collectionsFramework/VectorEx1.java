package re.sta.rt.collectionsFramework;

import java.util.Vector;

public class VectorEx1 {

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
        System.out.println();
    }
    public static void main(String[] args) {
        Vector v = new Vector(5); // 용량(capacity)이 5인 Vector를 생성한다.
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 빈공간을 없앤다. ( 용량과 데이터가 담겨진 크기가 같아진다. )
        System.out.println("=== After trimToSize ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize ===");
        print(v);

        v.clear(); // v만 사라지고 용량은 남아있는다.
        System.out.println("=== After Clear() ===");
        print(v);


        /*
               ArrayList 나 Vector 같이 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는 데는 효율이 좋지만,
               용량을 변경해야 할 때는 새로운 배열을 생성 후, 기존의 배열로부터 새로 생성된 배열로
               데이터를 복사해야하기 때문에 상당히 효율이 떨어진다는 단점을 가지고 있다.

               그래서,
               처음에 인스턴스를 생성할 때, 저장할 데이터의 개수를 잘 고려하여 충분한 용량의 인스턴스를 생성하는 것이 좋다.

         */



    }
}
