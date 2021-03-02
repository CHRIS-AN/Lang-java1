package re.sta.rt;

class Car {
    String color;
    int door;
    
    void drive () {
        System.out.println("drive, Brrr~~~~");
    }
    
    
    void stop() {
        System.out.println(" stop !!!!");
    }
}

class FireEngine extends Car {
    void water () {
        System.out.println("water !! 물뿌리기");
    }
}


public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        System.out.println(fe.getClass().getName());
        FireEngine fe2 = new FireEngine();
        //FireEngine fe3 = new Car(); 자손참조변수가 조상인터스턴스를 참조할 수가 없다.
        fe.water();
        car = fe; // 자손이 조상으로 형변환을 한 것.
        fe2 = (FireEngine) car;
        fe2.water();
        System.out.println(fe2.getClass().getName());
    }
}
