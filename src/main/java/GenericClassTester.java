

// 제네릭


/*

    제네릭은 처리해야 할 대상의 자료형에 의존하지 않는 클래스(인터페이스) 구현 방식입니다.
    제네릭 클래스는 자료형에 의존하지 않기 때문에 범용으로 사용할 수 있습니다. 또한 JAVA에서 지원하는 기능이므로 안전한 방법으로
    사용할 수 있습니다. 제네릭 클래스는 클래스 이름 바로 뒤에 <Type> 같은 형식의 파라미터를 붙혀 선언합니다.


    문법.
    class 클래스이름 <파라미터> { }
    interface 인터페이스 <파라미터> { }

    class 클래스이름 <파라미터1, 파라미터2, ... > { }
    interface 인터페이스 <파라미터1, 파라미터2, ...> { }

    이렇게 정의된 클래스나 인터페이스는 매개변수로 정의한 '자료형'을 전달받을 수 있습니다.
    파라미터 이름을 작성하는 방법은 4가지로 나눌 수 있습니다.

    1. 1개의 대문자를 사용합니다 ( 소문자는 가급적 사용하지 않습니다 )
    2. 컬렉션( Collection )의 자료형은 element의 앞글자인 E를 사용합니다.
    3. 맵(Map)의 키(key), 값(value)은 key와 value의 앞글자인 K와 V를 사용합니다.
    4. 일반적으로는 T를 사용합니다.


    또한,
    형변수에는 와일드카드를 지정하는 것도 가능합니다.
    <? extends T> : 클래스 T의 서브 클래스를 전달받습니다.
    <? super T> : 클래스 T의 슈퍼 클래스를 전달받습니다.
*/




public class GenericClassTester {

    static class GenericClass<T> {
        // 제네릭 클래스의 파라미터를 T 라고 작성합니다.
        private T xyz;
        GenericClass(T t) { //생성자
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}