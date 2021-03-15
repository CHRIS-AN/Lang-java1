package re.sta.rt.exceptionHandling;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {

            method1();
        }catch (Exception e) {
            System.out.println("main 메서드에서 예외처리가 처리됨");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new Exception();
    }
}
