import java.util.Scanner;

// 검색 범위의 맨 앞 인덱스를 pl, 맨 끝 인덱스를 pr, 중앙 인덱스를 pc라고 지정합니다.
// 검색을 시작할 때, pl은 0, pr은 n-1, pc는 (n-1)/2로 초기화 합니다.


public class BinSearch {

    static int binSearch(int [] a, int n , int key) {
        int pl = 0;  // 검색 범위의 첫 인덱스
        int pr = n -1 ; // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스.
            if (a[pc] == key)
                return  pc; // 검색 성공하였습니다.
            else if (a[pc] < key)
                pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
        }while(pl <= pr);

        return -1; // 검색 실패 !
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 요솟수 : ?");
        int num = sc.nextInt();
        int [] x = new int [num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.println("x[0] :"); // 첫 요소 입력
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.println(" x [" + i + "]");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]); //  바로 앞의 요소보다 작으면, 다시 입력.
        }

        System.out.println("검색할 값 : ?");
        int key = sc.nextInt();
        int index = binSearch(x,num,key);

        if(index == -1)
            System.out.println("그 값의 요소가 없습니다");
        else
            System.out.println(key + "은(는) x["+index+"] 에 있습니다.");
    }
}
