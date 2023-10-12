package Practice.Arrays;

import java.util.Arrays;

public class LargestNo {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 20, 5, 9, 25, 2, 1};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < largestNo(arr); i++) {
            arr2[i] = arr[i];
        }
        arr2[largestNo(arr)] = arr[secLargestNo(arr)];
        arr2[largestNo(arr) + 1] = arr[largestNo(arr)] - arr[secLargestNo(arr)];


        for (int i = largestNo(arr) + 2; i < arr2.length; i++) {
            arr2[i] = arr[i - 1];
        }

        System.out.println(Arrays.toString(arr2));

    }

    static int largestNo(int[] arr) {
        int largest = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
                j = i;
            }
        }
        return j;
    }
    static int secLargestNo(int[] arr) {
        int secLargest = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (secLargest < arr[i] && arr[i] < arr[largestNo(arr)]) {
                secLargest = arr[i];
                j = i;
            }
        }
        return j;
    }
}
