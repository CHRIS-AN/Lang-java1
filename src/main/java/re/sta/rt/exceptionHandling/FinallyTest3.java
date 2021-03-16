package re.sta.rt.exceptionHandling;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1() 의 수행을 마치고 main메서드를 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1() 메소드가 실행되었습니다.");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("method1 () 의 finally 블럭이 실행되었습니다.");
        }
    }
}
