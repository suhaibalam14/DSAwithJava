package Classroom;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.swap;

public class ArrayListMoveZero {
    static void moveZero(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            int last = arr.size()-1-i;
            int getZero = zero(arr,last);
            swap(arr,last,getZero);
        }
        System.out.println(arr);
    }

    public static int zero(ArrayList<Integer> arr, int last) {
        int zero = 1;
        for (int i = 0; i <= last ; i++) {
            if (arr.get(i) == 0){
                zero = i;
                break;
            }
        }
        return zero;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,1));
        moveZero(arr);
    }
}
