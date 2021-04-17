package re.sta.rt.calendar;


/*

    MessageFormat 은 데이터를 정해진 양식에 맞게 출력할 수 있도록 도와준다.
    데이터가 들어갈 자리를 마련해 놓은 양식을 미리 작성하고 프로그램을 이용해서
    다수의 데이터를 같은 양식으로 출력할 때 사용하면 좋다.

    예를 들어 고객들에게 보낼 안내문을 출력할 때, 같은 안내문 양식에 받는 사람의 이름과
    같은 데이터만 달라지도록 출력할 때, 또는 하나의 데이터를 다양한 양식으로 출력할 때
    사용한다.

    그리고,
    SimpleDateFormat 의 parse 처럼 MessageFormat 의 parse 를 이용할면 지정된 양식에서
    필요한 데이터만을 손쉽게 추출해 낼 수도 있다.



 */


import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name :  {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object [] arguments = {
                "이자바" , "02-123-4565" , "28", "07-09"
        };

        String result =
                MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
