package re.sta.rt;

interface I {
    public abstract void play();
}

class A {
    void autoPlay (I i) {
        i.play();
    }
}

class B implements I {
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        a.autoPlay(new B());
        a.autoPlay(c);
    }
}
