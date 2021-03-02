package re.sta.rt;

class Product {
    int price;
    int bonusPoint;

    Product (int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product(){}   // 아래 자손 class가 super를 사용하지 않도록 아무것도 없는 생성자를 만들어 놓는다.
}

class Tv extends Product {
    Tv() {
        super(100);  // 조상 클래스의 생성자 값 변경
    }
    public String toString() {
        return "Tv ";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio ";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString () {
        return "Computer ";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product [] items = new Product[10]; // 빈 공간의 인스턴스.
    int i = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            int chk = -(money - p.price);
            System.out.println("부족한 잔액은 " + chk +"만원 입니다." );
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        items[i++] = p; // 제품을 Product[]items 에 저장을 합니다.
        System.out.println(p + "을/를 구입하셨습니다."); // 각 제품 class의 string return 값이 담기는 p 입니다.
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i < items.length; i++) {
            if(items[i]==null) break;
            sum += items[i].price; // 제품을 총 구매한 가격을 저장합니다.
             //itemList += items[i] + ", "; // item구매 내역을 확인할 수 있습니다.
            itemList +=
                    (i==0) ?
                             "" + items[i]
                                            :
                                                ", " + items[i];
            // 처음에 반 점이 없는 제품이 찍히고, 뒤에는 반 점 + 제품을 넣어주는 삼항연산자 사용.
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품리슽는 " + itemList + " 입니다.");

    }
}


public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Audio());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Tv());
        b.buy(new Computer());
        b.summary();

    }
}
