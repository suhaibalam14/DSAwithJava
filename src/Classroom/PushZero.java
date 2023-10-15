package Classroom;

import java.util.ArrayList;
import java.util.Arrays;

public class PushZero {
    static void push(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int nonZero = getNonZero(arr, i);
            if (arr.get(nonZero) == 0)
                return;
            swap(arr, i, nonZero);
        }
    }

    public static void swap(ArrayList<Integer> arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }

    public static int getNonZero(ArrayList<Integer> arr, int x) {
        int nonZero = arr.size() - 1;
        for (int i = x; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                nonZero = i;
                break;
            }
        }
        return nonZero;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1));
        push(arr);
        System.out.println(arr);
    }
}
