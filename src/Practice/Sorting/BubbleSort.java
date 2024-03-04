package Practice.Sorting;

import java.util.Arrays;

public class  BubbleSort {
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    swapped= true;
                }
            }
            if (!swapped)
                break;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 8, 7, 9, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
