package re.sta.rt.javaLang;

import com.sun.jdi.Value;

public class EqualsEx1 {
    public static void main(String[] args) {
        Valued v1 = new Valued(10);
        Valued v2 = new Valued(10);


        if(v1.equals(v2)) {
            System.out.println("v1과 v2는 동일합니다");
        }else {
            System.out.println("v1과 v2는 다릅니다.");
        }

        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1과 v2는 동일합니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Valued {
    int value;

    public Valued(int value) {
        this.value = value;
    }
}
