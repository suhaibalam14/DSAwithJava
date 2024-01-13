package OOPs.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class InBuiltArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
            list.add(12);
        for (int i = 1; i <= 20; i++) {
           list.add(i*2);
        }
        list.add("hello");
        list.add(12.3645);
        list.add('a');
//        System.out.println(list);
//        System.out.println(list.get(2));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(45);
        list2.add(45);
        list2.add(45);
        list2.add(45);
        list2.add(45);
        list2.add(45);
        System.out.println(list2);



    }

}
