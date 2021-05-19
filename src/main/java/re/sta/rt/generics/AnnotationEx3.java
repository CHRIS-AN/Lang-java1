package re.sta.rt.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class suppressWarningTestClass {
    int newField;
    int getNewField() {
        return newField;
    }
    @Deprecated
    int oldField;
    @Deprecated
    int getOldField() {
        return oldField;
    }

    @Override
    public String toString() {
        return "suppressWarningTestClass{" +
                "newField=" + newField +
                ", oldField=" + oldField +
                '}';
    }
}

public class AnnotationEx3 {

    @SuppressWarnings({"deprecated","unchecked"})
    public static void main(String[] args) {
        suppressWarningTestClass nc = new suppressWarningTestClass();
        nc.oldField = 10;
        System.out.println(nc.oldField);

        ArrayList<suppressWarningTestClass> list = new ArrayList<>();

        list.add(nc);

        System.out.println(list.toString());


    }
}
