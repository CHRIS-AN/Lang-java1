package re.sta.rt.generics;

/**
 * @author 안정민
 * @since 2021-05-20
 *
 */


abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {
        return ordinal;
    }

    public MyEnum(String name) {
        this.ordinal = id++;
        this.name = name;
    }

    @Override
    public int compareTo(T o) {
        return ordinal - o.ordinal;
    }
}

abstract class MyTransportation extends MyEnum {
    // enum 설정
    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation SHIP = new MyTransportation("SHIP", 400) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE",5600) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    abstract int fare (int distance); // 추상 메서드
    protected final int BASIC_FARE;

    public MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EnumEx4 {
    public static void main(String[] args) {
        MyTransportation t1 = MyTransportation.BUS;
        System.out.printf("t1 = %s, %d%n", t1.name(), t1.ordinal());
    }
}
