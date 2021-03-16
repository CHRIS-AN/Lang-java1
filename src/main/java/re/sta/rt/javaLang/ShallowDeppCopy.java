package re.sta.rt.javaLang;


class PointClass {
    int x, y;

    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "PointClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Cloneable{
    PointClass p;
    double r;

    public Circle(PointClass p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;

        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e) {

        }
        Circle c = (Circle) obj;
        c.p = new PointClass(this.p.x, this.p.y);
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}


public class ShallowDeppCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new PointClass(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        c1.p.x = 0;
        c1.p.y = 0;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

    }
}
