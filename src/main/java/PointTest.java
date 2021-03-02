

public class PointTest {
    public static void main(String[] args) {
//        Point3D p3 =new Point3D(1,2,3);
//        System.out.println("여기는?");
//        System.out.println("x = " + p3.x);

        System.out.println("----------------------");
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);

    }
}

class Pointchek {
    //int x,y;
    int x = 10;
    int y = 20;
     Pointchek(int x, int y) {
         this.x = x;
         this.y = y;
         System.out.println(x);
         System.out.println(y);
     }
}

class Point3D extends Pointchek {
    int z = 30;

    Point3D () {
        this(100,200,300);
    }

    Point3D (int x, int y, int z) {
        super(x,y);
        System.out.println("난 뭘까? " + this.z);
        this.z =  1000;
        System.out.println("난 뭐지? " + this.z);
        System.out.println("x : " + x +", y : " + y + ", z : " + this.z + " z2 : " + z);
    }
}
