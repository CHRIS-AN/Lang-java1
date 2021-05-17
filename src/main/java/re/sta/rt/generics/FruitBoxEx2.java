package re.sta.rt.generics;


class FruitEx2 implements Eatable {
    public String toString () {
        return "과일";
    }
}
class AppleEx2 extends FruitEx2 {
    public String toString () {
        return "사과";
    }
}
class GrapeEx2 extends FruitEx2 {
    public String toString () {
        return "포도";
    }
}
class ToyEx2  {
    public String toString () {
        return "장난감";
    }
}

interface Eatable { }

public class FruitBoxEx2 {
    public static void main(String[] args) {

        FruitBox<FruitEx2> fruitBox = new FruitBox<FruitEx2>();
        FruitBox<AppleEx2> appleBox = new FruitBox<AppleEx2>();
       // FruitBox<ToyEx2> toyBox = new FruitBox<ToyEx2>();  error)
        FruitBox<GrapeEx2> grapeBox = new FruitBox<GrapeEx2>();

        fruitBox.add(new FruitEx2());
        fruitBox.add(new AppleEx2());
        fruitBox.add(new GrapeEx2());
        appleBox.add(new AppleEx2());
        //appleBox.add(new GrapeEx2()); error) 자손 x
        grapeBox.add(new GrapeEx2());
       // toyBox.add(new ToyEx2());

        System.out.println("fruit - " + fruitBox);
        System.out.println("apple - " + appleBox);
        System.out.println("grape - " + grapeBox);
       // System.out.println("toy - " + toyBox);
    }
}
                                                    // Box 를 상속 받은건 FruitBoxEx1.java 에있는 걸 받음.
class FruitBox<T extends FruitEx2 & Eatable> extends Box<T> {}