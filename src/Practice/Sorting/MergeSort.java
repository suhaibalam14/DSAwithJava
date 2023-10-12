package Practice.Sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] sort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] third = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                third[k] = first[i];
                i++;
            } else {
                third[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            third[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            third[k] = second[j];
            j++;
            k++;
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 4, 3, 7, 9, 1, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
