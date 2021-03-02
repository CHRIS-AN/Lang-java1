package re.sta.rt;

interface II {
    public abstract void methodB();
    default void newMethod() {}

}

class InstanceManager {
    public static II getInstance() {
        return new BB();
    }
}
class AA {
    void methodA() {
        II ii = InstanceManager.getInstance();
        ii.methodB();
        System.out.println(ii.toString());
    }
}

class BB implements II {

    public  String toString() {
        return "Class B";
    }

    @Override
    public void methodB() {
        System.out.println("methodB in BB class");
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        AA a = new AA();
        a.methodA();
    }
}

