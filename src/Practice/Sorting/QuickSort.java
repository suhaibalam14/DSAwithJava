package Practice.Sorting;

import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr, int low, int high){
        if (low>high)
            return;
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s<=e) {
            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;
        if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);

    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e] =temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,6,7,2,3,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
