package re.sta.rt.generics;

class Parent {
    void parentMethod() {

    }
}

class Child extends Parent {
    @Override
    void parentMethod() {
        super.parentMethod();
    }
}



public class AnnotationEx1 {
    public static void main(String[] args) {

    }
}
