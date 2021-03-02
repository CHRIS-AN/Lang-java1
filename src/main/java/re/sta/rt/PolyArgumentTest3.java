package re.sta.rt;

import java.util.Vector;

class Product3 {
    int price;
    int bonusPoint;

    Product3 (int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product3(){}   // 아래 자손 class가 super를 사용하지 않도록 아무것도 없는 생성자를 만들어 놓는다.
}

class Tv3 extends Product3 {
    Tv3() {
        super(100);  // 조상 클래스의 생성자 값 변경
    }
    public String toString() {
        return "Tv ";
    }
}

class Audio3 extends Product3 {
    Audio3() {
        super(50);
    }
    public String toString() {
        return "Audio ";
    }
}

class Computer3 extends Product3 {
    Computer3() {
        super(200);
    }
    public String toString () {
        return "Computer ";
    }
}

class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품으 저장하는데, 사용될 Vector 객체

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            int chk = -(money - p.price);
            System.out.println("부족한 잔액은 " + chk +"만원 입니다." );
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        item.add(p); // 구입한 벡터를 저장한다.
        System.out.println(p + "을/를 구입하셨습니다."); // 각 제품 class의 string return 값이 담기는 p 입니다.
    }

    void refund (Product p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        }else {
            System.out.println("구입하신 제품 중에 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i < item.size(); i++) {
            Product p  = (Product) item.get(i); // object이니, 참조변수로 형변환을 해주어야한다.
            // object를 바로 참조변수로 형변환을 하여, 참조변수에 넣습니다.
            sum += p.price;
            itemList += (i==0) ?  "" + p : ", " + p;
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품리슽는 " + itemList + " 입니다.");
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv t = new Tv();
        Computer com = new Computer();
        Audio a = new Audio();

        b.buy(t);
        b.buy(com);
        b.buy(a);
        b.summary(); // 상세 내역.
        b.refund(com);
        b.summary();
    }
}
