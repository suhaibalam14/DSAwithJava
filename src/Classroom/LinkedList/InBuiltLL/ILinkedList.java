package Classroom.LinkedList.InBuiltLL;

import java.util.LinkedList;

public class ILinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>  list = new LinkedList<>();
        list.add(15);
        for (int i = 1; i <= 20; i++) {
            list.add(i*2);
        }
        System.out.println(list);
    }

}
