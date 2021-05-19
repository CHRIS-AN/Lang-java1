package re.sta.rt.generics;

enum Transportation {
    BUS(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    protected final int BASIC_FARE;  // protected 로 해야 각 상수에 접근이 가능하다.

    Transportation(int basic_fare) { // private 이 생량이 되어 있다고 생각해야한다.
        BASIC_FARE = basic_fare;
    }

    // point
    public int getBasicFare() {
        return  BASIC_FARE;
    }
    abstract int fare (int distance); // 거리에 따른 요금 계산) -> 열거형에 정의된 추상 메서드를 각 상수가 어떻게 구현하는지 보여준다.

}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare = " + Transportation.BUS.fare(100));
        System.out.println("train fare = " + Transportation.TRAIN.fare(200));
        System.out.println("ship fare = " + Transportation.SHIP.fare(500));
        System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(600));
    }
}
