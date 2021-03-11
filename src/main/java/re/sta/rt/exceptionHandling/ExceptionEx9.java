package re.sta.rt.exceptionHandling;


/*
    키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있으며, 방법은 아래의 순서를 따르면 된다.

    1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
            Exception e = new Exception("고의로 발생시켰음");
    2. 키워드 throw를 이용해서 예외를 발생시킨다.
 */


public class ExceptionEx9 {
    public static void main(String[] args) {
        try{

            Exception e = new Exception("고의로 발생시켰음");
            throw e; // 예외를 발생시킴.

            //throw  new Exception("고의로 발생 시켰음.");   위의 두 줄을 이렇게 한 줄로 쓸 수 있다.

        }catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었습니다.");



    }
}
