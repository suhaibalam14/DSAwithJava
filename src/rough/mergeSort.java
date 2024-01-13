package rough;
import java.util.Arrays;

public class mergeSort {
    public static void sort(int[] arr) {
        if (arr.length == 1)
            return;

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - left.length];

        for (int i = 0; i < arr.length / 2; i++) {
            left[i] = arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            right[i - arr.length / 2] = arr[i];
        }
        sort(left);
        sort(right);
        merge(arr, left, right);
    }
    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length & j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 3, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
