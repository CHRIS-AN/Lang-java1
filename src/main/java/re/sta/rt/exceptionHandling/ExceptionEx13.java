package re.sta.rt.exceptionHandling;

public class ExceptionEx13 {
    public static void main(String[] args) {


        method1();
    }

    static void method1() {
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("method1 메서드에서 예외처리가 되었습니다.");
            e.printStackTrace();
        }
    }
}
