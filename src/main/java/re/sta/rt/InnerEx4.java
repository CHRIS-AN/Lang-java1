package re.sta.rt;

class OuterClass {
    class InstanceInner {
        int iv = 100;
    }


    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}


public class InnerEx4 {
    public static void main(String[] args) {

        // 인스턴스 클래의 인스턴스를 생성하려면? 외부 클래스의 인스턴스를 먼저 생성해야한다.

        OuterClass oc = new OuterClass();
        OuterClass.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer.StaticInner.cv : " + OuterClass.StaticInner.cv);



        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.

        OuterClass.StaticInner si = new OuterClass.StaticInner();
        System.out.println("si.iv : " + si.iv);

    }
}


