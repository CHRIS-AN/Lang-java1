public class final_test {
    public static void main(String[] args) {
        int i, j;

        int temp;

        int [] a = {5, 2, 6, 3, 7};
        for(i=1; i<5; i++) {
            j = i - 1;

            /*
                i = 1/ j = 0
                i = 2/ j = 1
                i = 3/ j = 2
                i = 4/ j = 3
             */

            while ((j >= 0)&& (a[j] > a[j+1])) {
                // a[0] 과 a[1]를 비교해서 왼쪽에있는 수가 크면 while문 입장


                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;

                j--;
            }
        }
        for(i = 0; i < 3; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
