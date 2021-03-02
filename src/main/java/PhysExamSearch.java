
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    static class PhysData {

        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        public PhysData(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        public static class HeightOrderComparator implements Comparator<PhysData> {
            @Override
            public int compare(PhysData o1, PhysData o2) {
                return (o1.height > o2.height) ? 1 :
                        (o1.height < o2.height) ? -1 : 0;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhysData [] x = {
                new PhysData("이나령", 152, 0.3),
                new PhysData("안정민", 180, 1.5),
                new PhysData("기면섭", 177, 1.0),
                new PhysData("이효리", 168, 1.2),
                new PhysData("이상순", 183, 1.0)
        };

        System.out.println("몇 cm인 사람을 찾고 있습니까?");
        int height = sc.nextInt();
        int index = Arrays.binarySearch(
                x,  // 배열 x에서
                new PhysData("", height, 0.0), // 키가 height인 요소를
                PhysData.HEIGHT_ORDER    // HEIGHT_ORDER 에 의해 검색
        );


        if(index<0)
            System.out.println("요소가 없습니다.");
        else
            System.out.println("x[" + index + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[index]); // toString 메서드 호출.
    }
}
