package re.sta.rt.exceptionHandling;






public class ExceptionEx1 {
    public static void main(String[] args) {



        try{
            // if 문과 달리, try 블럭이나 catch 블럭 내에 포함된 문장이 하나뿐이어도 괄호{}를 생략할 수 없다.


            try {}catch (Exception e) {}

        }catch (Exception e) {

            try {

                //}catch (Exception e) {} 같은 참조변수 변수명을 적을수 없다.
            }catch(Exception b) {

            }
        }
    }
}
