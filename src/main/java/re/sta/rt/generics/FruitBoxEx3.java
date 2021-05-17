package re.sta.rt.generics;



class Juice {
    String name;

    public Juice(String name) {
        this.name = name + "juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class FruitBox3<T extends Fruit> extends Box<T> {}

class Juicer {
    static Juice makeJuice(FruitBox3<? extends Fruit> box){
        String tmp = "";

        for (Fruit f : box.getList())
            tmp += f + " ";

        return new Juice(tmp);
    }
}


public class FruitBoxEx3 {
    public static void main(String[] args) {

            FruitBox3<Fruit> fruitBox = new FruitBox3<Fruit>();
            FruitBox3<Apple> appleBox = new FruitBox3<Apple>();

            fruitBox.add(new Apple());
            fruitBox.add(new Grape());
            appleBox.add(new Apple());
            appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }





}
