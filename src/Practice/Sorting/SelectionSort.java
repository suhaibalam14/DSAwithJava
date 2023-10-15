package Practice.Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, last, maxIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int getMaxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i]> arr[max])
                max=i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,4,3,7,9,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
