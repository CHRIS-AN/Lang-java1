package re.sta.rt.generics;


import java.util.Arrays;

class MyArrayList<T> {
    T [] arr;

    MyArrayList(T... arr) {
        this.arr = arr;
    }

    public static <T> MyArrayList<T> asList(T...a) {
        return new MyArrayList<>(a);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

public class AnnotationEx4 {
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1","2","3");
        System.out.println(list);
    }
}
