package re.sta.rt.javaLang;


class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

//    public Object clone(){
//        Object obj = null;
//        try {
//            obj = super.clone();
//        }catch (CloneNotSupportedException e) { }
//        return obj;

    public Point clone(){
        Object obj = null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e) { }
        return (Point) obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = (Point)original.clone();

        System.out.println("original : " + original.toString());
        System.out.println("copy : " + copy.toString());
    }

}
