
// 자연 정렬
/*
    binarySearch 메서드에 배열과 키 값을 전달하는 간단한 방법으로 검색할 수 있는 이유는 String 클래스가 Comparable<T> 인터페이스와
    compareTo 메서드를 구현하고 있기 때문이다.
*/
class A implements java.lang.Comparable<A> {

    @Override
    public int compareTo(A c) {
        return 0;

        /*
        this가 c보다 크면 양의 값 반환
        this가 c보다 작으면 음의값 반환
        this가 c와 같으면 0 반환
        */
    }

    public boolean equals(Object obj) {

        /*
        this가 o와 같으면 true 반환
        this가 c와 같지 않으면 false 반환
        */
        return (this == obj);
    }
}

public class Comparable {
    public static void main(String[] args) {

    }
}

