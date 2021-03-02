
/*

    super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
    멤버변수와 지역변수의 이름이 같을 때, this를 붙여서 구별했듯이
    상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super를 붙여서 구별한다.

    static메서드 (클래스 메서드)는 인스턴스와 관련이 없다. 그래서 this와 마찬가지로 super역시 static메서드에서는
    사용할 수 없고, 인스턴스메서드에서만 사용할 수 있다.

 */

/*

    this()와 마찬가지로 super() 역시 생성자이다.
    this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만,
    super()는 조상 클래스의 생성자를 호출하는데 사용된다.

*/


class Parent {
    int x = 10;
}

class Child extends Parent{

    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Point {
    int x;
    int y;

    String getLocation () {
        return "x : " + x + ", y : " + y;
    }
}


public class Super {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

