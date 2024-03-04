package Practice.Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = n/2-1 ; i >= 0 ; i--) {
            heapify(arr, i, n);
        }
        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int parent = i;
        int left = 2*parent+1;
        int right = 2*parent+2;
        while (left < n){
            int max = parent;
            if (arr[left] > arr[max])
                max = left;
            if (right < n && arr[right] > arr[max])
                max = right;
            if (max == parent)
                return;
            int temp = arr[max];
            arr[max] = arr[parent];
            arr[parent] = temp;

            parent = max;
            left = 2*parent+1;
            right = 2*parent+2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 9, 20, 5, 8, 15};
        int[] myArray = {
                23, 56, 8, 17, 42, 93, 5, 71, 14, 36,
                64, 11, 29, 88, 47, 19, 72, 33, 50, 66,
                9, 78, 25, 38, 3, 61, 80, 95, 26, 54,
                12, 69, 41, 87, 16, 77, 22, 58, 44, 91,
                7, 32, 68, 15, 83, 49, 74, 31, 79, 6,
                24, 53, 98, 27, 70, 13, 40, 85, 18, 63,
                89, 35, 60, 81, 48, 75, 30, 94, 21, 46,
                1, 55, 82, 37, 73, 10, 67, 28, 57, 84,
                43, 90, 4, 65, 20, 76, 59, 34, 50, 97,
                2, 45, 92, 16, 53, 7, 39, 86, 52, 99
        };

        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
