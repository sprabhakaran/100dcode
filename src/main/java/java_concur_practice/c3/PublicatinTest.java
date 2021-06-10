package java_concur_practice.c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PublicatinTest {
    static int[] arr = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {

        List l = StaticClass.getList();
        l.add(10);
        l.add(29);

        System.out.println(StaticClass.getList());

    }

    public static List getArray() {
        return List.of(1, 2, 3);
    }


}

class StaticClass {
    public static List list = new ArrayList();

    public static List getList() {
        return list;
    }
}
