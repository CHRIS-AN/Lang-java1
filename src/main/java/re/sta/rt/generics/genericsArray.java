package re.sta.rt.generics;

public class genericsArray <T> {

    T[]itemArr;   // T 타입의 배열을 위한 참조변수.

    T[]toArray() {
        //T[]tmpArr = new T[itemArr.length];  // error) 지네릭 배열 생성 불가.
        return null;


        /*

            지네릭 배열을 생성할 수 없는 것은 new 연산자 때문인데,
            이 연산자는 컴파일 시점에 타입 T가 뭔지 정확히 알아야 한다.
            그런데 위의 코드에 정의된 제니릭클래스를 컴파일 하는 시점에서는 T가 어떤타입이 될지 전혀 알 수 없다.
            instanceof 연산자도 new 연산자와 같은 이유로 T를 피연산자로 사용할 수 없다.


         */
    }
}
