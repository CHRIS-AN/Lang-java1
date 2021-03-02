package re.sta.rt;

public class InnerEx2 {

    class InstanceInner {
        int a = 100;
    }
    static class StaticInner {}

    InstanceInner iv = new InstanceInner(); // 인스턴스 간에 서로 접근이 가능
    static StaticInner cv = new StaticInner(); // static 멤버 간에는 서로 접근이 가능

    static void staticMethod() {
  //      InstanceInner obj1 = new InstanceInner(); // static 멤버는 인스턴스 멤버에 접근 x
        StaticInner obj2 = new StaticInner();

        // 굳이 접근을 해야한다면? ↓
        InnerEx2 outer = new InnerEx2();
        // 아래 두 개를 비교하기. ( 인스턴스 클래스는 외부클래스를 먼저 생성해야만이 생성할 수 있따.
        InstanceInner obj1 = new InnerEx2().new InstanceInner();
        InstanceInner obj3 = outer.new InstanceInner();
    }

    void MethodInnerClass() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }


    void instanceMethod() {

        InstanceInner obj1 = new InstanceInner(); // 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능.
        StaticInner obj2 = new StaticInner(); // static 제어자를 못 붙힌다.

        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
        //LocalInner lv = new LocalInner();
    }
    public static void main(String[] args) {
        InnerEx2.InstanceInner d = new InnerEx2().new InstanceInner();
        System.out.println(d.a);
    }

}

