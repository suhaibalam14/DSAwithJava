package LL;

import java.util.LinkedList;

public class ILinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i*2);
        }
        System.out.println(list);
    }
}
