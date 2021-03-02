package re.sta.rt;

class Outer2{
    Outer you;

    class InnerDef{
    }
    void innDef_meth1() {
        //outer 의 hiding 된 요소 호출 : Outer.this.멤버요소
        System.out.println("기본 Inner 인스턴스 meth1() 시작:"+you.a+","+you.b+","+you.c);  //outer 멤버 접근 가능!!
        you.meth1();
        you.meth2();
        System.out.println("기본 Inner 인스턴스 meth1() 끝---------------------");
    }
}

class Outer{

    String a = "Outer_a", name, c= "Outer_c";
    static String b = "Outer_b";
    InnerDef def = new InnerDef("outer 안에 def", "outer.def.c");

    public Outer(String name) {
        super();
        this.name = name;
    }

    void meth1() {
        System.out.println("Outer 인스턴스 meth1()");
    }

    void meth2() {
        System.out.println("Outer 인스턴스 meth2()");
    }

    void meth3() {
        InnerDef loc = new InnerDef("outer 안에 def", "outer.def.c");
        Outer2 oo2 = new Outer2();
        oo2.you = this;
    }

    static void st_meth1() {
        System.out.println("Outer 스태틱 meth1()");
    }
    static void st_meth2() {
        System.out.println("Outer 스태틱 meth2()");

    }
    @Override
    public String toString() {
        return "Outer ["+name+":" + a +","+b +","+c + "]";
    }
    InnerDef getInnerDef() {
        //return def;
        return new InnerDef("outer안에 def", "outer.def.c");

    }

    //기본 inner
    class InnerDef{

        public InnerDef(String inName, String c) {
            this.inName = inName;
            this.c = c;
        }
        String inName;
        String c;  // outer와 중첩 (outer.c 를 hiding)
        String aa = "InnerDef_aa";

        //static String bb = "InnerDef__bb";  불가
        void innDef_meth1() {
            //outer 의 hiding 된 요소 호출 : Outer.this.멤버요소
            System.out.println("기본 Inner 인스턴스 meth1() 시작:"+a+","+b+","+c+","+aa+","+Outer.this.c);  //outer 멤버 접근 가능!!
            meth1();
            Outer.this.meth2();
            meth2();
            st_meth1();
            st_meth2();
            innDef_meth2();
            System.out.println("기본 Inner 인스턴스 meth1() 끝---------------------");
        }
        void innDef_meth2() {
            System.out.println("기본 Inner 인스턴스 meth2() 실행");
        }
        void meth2() {  //중첩
            System.out.println("기본 Inner 인스턴스 meth2()");
        }
        /* static void st_out_meth() {  불가

            System.out.println("Outer 스태틱 meth()");

        } */
        @Override
        public String toString() {
            return "InnerDef [" + inName + ": " + aa +","+c+ "]";
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {

        Outer out1 = new Outer("out1");

        //Outer.InnerDef inDef = new Outer.InnerDef("기본 inner");

        Outer.InnerDef inDef1 = out1.new InnerDef("기본 in1","기본c1");

        Outer.InnerDef inDef2 = out1.new InnerDef("기본 in2","기본c2");

        Outer.InnerDef inDef3 = out1.def;

        Outer.InnerDef inDef4 = out1.getInnerDef();



        System.out.println(out1);

        System.out.println(inDef1);

        System.out.println(inDef2);



        System.out.println("out1 >>>>>");

        out1.a = "바깥상어";

        System.out.println(out1.a);

        System.out.println(out1.b);

        out1.meth1();

        out1.meth2();

        out1.st_meth1();

        out1.st_meth2();

//        System.out.println(out1.aa);    //inner 멤버요소 접근 불가

//        out1.innDef_meth();



        System.out.println("inDef1 >>>>>");

//        System.out.println(inDef1.a);  //상속 개념이 아니므로 outer의 필드에 인스턴스변수로 접근 불가

//        System.out.println(inDef1.b);

//        inDef1.out_meth();

//        inDef1.st_out_meth();

        System.out.println(inDef1.aa);    //자신의 멤버요소만 접근 가능

        System.out.println(inDef1.c);    //자신의 멤버요소만 접근 가능

        inDef1.innDef_meth1();    //자신의 멤버요소만 접근 가능

        inDef1.meth2();



        System.out.println("inDef2 >>>>>");

        System.out.println(inDef2.aa);    //자신의 멤버요소만 접근 가능

        System.out.println(inDef2.c);    //자신의 멤버요소만 접근 가능

        inDef2.innDef_meth1();    //자신의 멤버요소만 접근 가능

        inDef2.meth2();



        System.out.println("out1.def >>>>>");

        System.out.println(out1.def.aa);    //자신의 멤버요소만 접근 가능

        System.out.println(out1.def.c);    //자신의 멤버요소만 접근 가능

        out1.def.innDef_meth1();    //자신의 멤버요소만 접근 가능

        out1.def.meth2();

    }
}
