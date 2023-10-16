package Practice.Sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    static void sort(int[] arr, int s, int e) {
        if (e - s == 1)
            return;

        int mid = s + (e - s) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, e);

        merge(arr, s, mid, e);

    }

    static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 5, 3, 2, 1};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
