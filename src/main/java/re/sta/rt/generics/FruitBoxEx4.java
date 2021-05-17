package re.sta.rt.generics;

import java.util.Collections;
import java.util.Comparator;

class FruitEx4 {
    String name;
    int weight;

    public FruitEx4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "(" + weight + ")";
    }
}

class AppleEx4 extends FruitEx4 {
    public AppleEx4(String name, int weight) {
        super(name, weight);
    }
}

class GrapeEx4 extends FruitEx4 {

    public GrapeEx4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<AppleEx4> {
    @Override
    public int compare(AppleEx4 t1, AppleEx4 t2) {
        return t2.weight = t1.weight;
    }
}

class GrapeComp implements Comparator<GrapeEx4> {

    @Override
    public int compare(GrapeEx4 o1, GrapeEx4 o2) {
        return o2.weight - o1.weight;
    }
}

class FruitComp implements Comparator<FruitEx4> {
    @Override
    public int compare(FruitEx4 c1, FruitEx4 c2) {
        return c2.weight - c1.weight;
    }
}

class FruitBox_4<T extends FruitEx4> extends Box<T> {}

public class FruitBoxEx4 {
    public static void main(String[] args) {

        FruitBox_4<AppleEx4> appleBox = new FruitBox_4<AppleEx4>();
        FruitBox_4<GrapeEx4> grapeBox = new FruitBox_4<GrapeEx4>();

        appleBox.add(new AppleEx4("GreenApple", 3300));
        appleBox.add(new AppleEx4("GreenApple", 2200));
        appleBox.add(new AppleEx4("GreenApple", 1800));

        grapeBox.add(new GrapeEx4("YellowGrape", 300));
        grapeBox.add(new GrapeEx4("YellowGrape", 200));
        grapeBox.add(new GrapeEx4("YellowGrape", 100));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());


        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
