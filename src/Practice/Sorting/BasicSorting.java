package Practice.Sorting;

import java.util.Arrays;

public class BasicSorting {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 8, 7, 9, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

