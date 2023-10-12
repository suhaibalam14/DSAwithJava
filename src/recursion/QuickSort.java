package recursion;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2, 6};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
