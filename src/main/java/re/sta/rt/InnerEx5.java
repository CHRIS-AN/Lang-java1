package re.sta.rt;


class OuterClassEx5 {
    int value = 10; // OuterClassEx5.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value :" + this.value);
            System.out.println("OuterClassEx5.this.value : " + OuterClassEx5.this.value);
        }
    }
}

public class InnerEx5 {





    public static void main(String[] args) {
        OuterClassEx5 outer = new OuterClassEx5();
        OuterClassEx5.Inner inner = outer.new Inner();

        inner.method1();

    }
}
