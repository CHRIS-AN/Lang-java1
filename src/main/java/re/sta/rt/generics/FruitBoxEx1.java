package re.sta.rt.generics;

import javax.swing.*;
import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "사과";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        Box<Grape> grapeBox = new Box<Grape>();
        //Box<Grape> grapeBox = new Box<Apple>();    error) 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        //appleBox.add(new Toy()); error) Box<Apple>에는 Apple 만 담을 수 있음

        toyBox.add(new Toy());
        //toyBox.add(new Apple()); error) Box<Toy>에는 Toy 만 담을 수 있음


        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

    }
}


class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get (int i) {
        return list.get(i);
    }

    int size () {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

    public ArrayList<T> getList() {
        return list;
    }
}
