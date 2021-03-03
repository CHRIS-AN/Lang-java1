package re.sta.rt;

/*
 참고 url : https://velog.io/@kyle/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-%EC%A0%84%EB%9E%B5%ED%8C%A8%ED%84%B4%EC%9D%B4%EB%9E%80
 자주와조요 블로그
 */


/*
    전략 패턴 또는 정책 패턴은 실행 중에 알고리즘을 선택할 수 있게 하는 행위 소프트웨어 디자인 패턴이다.
    전략 패턴은 특정한 계열의 알고리즘들을 정의하고 각 알고리즘을 캡슐화하며, 이 알고리즘들을 해당 계열 안에서
    상호 교체가 가능하게 만든다.
    전략은 알고리즘을 사용하는 클라이언트와 독립적으로 다양하게 만든다.
 */

/*
    예시 상황
        한 과일 매장은 상황에 따라 다른 가격 할인 정책을 적용하고 있습니다.
        제일 먼저 온 손님에게 10% 할인해주고 마지막 손님은 20%
        그리고 신선도가 떨어진 과일에 대 해서는 20% 할인을 해주고 있습니다.
        이러한 상황을 가정하고 이를 구현하는 코드를 작성해보겠습니다.
 */


import java.awt.*;
import java.util.Arrays;
import java.util.List;

// 전략 패턴이 적용되지 않은 코드
class Calculator {

    public double calculate(boolean isFirstGuest, boolean isLastGuest, List<Item> items) {
        double sum = 0;
        for ( Item item : items) {
            if(isFirstGuest) {
                sum += item.getPrice() * 0.9; // 첫번째 손님
            } else if (!item.isFresh()) {
                sum += item.getPrice() * 0.8; // 신선도가 떨어진 과일에 대해서?
            } else if (isLastGuest) {
                sum += item.getPrice() * 0.8; // 손님 마지막
            } else {
                sum += item.getPrice(); // 모든 과일.
            }
        }
        return sum;
    }

}
class Item {
    private final String name;
    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFresh() {
        return true;
    }
}
//----------------------------------------------------------------------------------------------


interface DiscountPolicy {
    double calculateWithDisCountRate(Item item);
}

class FirstCustomerDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.9;
    }
}

class LastCustomerDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.8;
    }
}

class UnFreshFruitDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.8;
    }
}

public class StrategyPattern {

    private final DiscountPolicy discountPolicy;

    public StrategyPattern(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculate(List<Item> items) {
        double sum = 0;

        for (Item item : items) {
            sum += discountPolicy.calculateWithDisCountRate(item);
        }

        return sum;
    }

    public static void main(String[] args) {
        StrategyPattern strategyPattern = new StrategyPattern(new FirstCustomerDiscount());
        strategyPattern.calculate(Arrays.asList(
                new Item("Apple 3000",3000),
                new Item("Banana", 4000),
                new Item("Orange", 3000),
                new Item("Pitch", 3000)
        ));
    }
}


/*
    전략패턴의 장점

    컨텍스트 코드의 변경없이 새로운 전략을 추가할 수 있다는 점.
    즉, 요구사항이 변경되었을 때, 기존 코드를 변경하지 않아도 된다는 것이 전략패턴의 장점이며, 새로운 전략에
    대해서는 새로운 클래스를 통해 관리하기 때문에 OCP의 원칙을 준수할 수 있는 패턴입니다.

    전략패턴의 단점

    짧은 코드에서는 패턴을 사용하지 않은게 더 보기가 편합니다.
    즉, 모든 상황에서 전략패턴이 사용되는 것은 유용하지 않습니다.
    컨텍스트에 적용되는 알고리즘이 하나이거나 두 개인 경우는 분기를 타는 것이 편한 경우가 있습니다.

        * 전략패턴은 하나의 추상화 기법이기 때문에 단순한 경우에도 전략패턴을 사용해야하는 경우도 있습니다.
          예를들어 랜덤한 로직을 테스트한다거나? Mock 객체를 생성하여 Controller를 테스트하는 경우 등
          다양한 경우에는 유용하게 사용합니다.

 */
