package re.sta.rt.exceptionHandling;

public class ExceptionEx2_3 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;


        for (int i = 0; i < 10; i++) {
            try{
                result = number/(int)(Math.random() * 10);
                System.out.println(result);
            }catch (ArithmeticException ae) {
                System.out.println("산술연산과정에서 오류가 발생하였습니다.");
            }
        }
    }
}
