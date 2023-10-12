package Practice.Arrays;

import java.util.Arrays;

public class MinMaxDiff {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 25};
        System.out.println(Arrays.toString(minDiff(arr)));
        System.out.println(Arrays.toString(maxDiff(arr)));


    }

    static int[] minDiff(int[] arr) {
        int minDiff = Math.abs(arr[1] - arr[0]);
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = Math.abs(arr[i] - arr[j]);
                if (x < minDiff) {
                    minDiff = x;
                    p1 = arr[i];
                    p2 = arr[j];
                }
            }
        }

        return new int[]{p1, p2};
    }
    static int[] maxDiff(int[] arr) {
        int maxDiff = Math.abs(arr[1] - arr[0]);
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = Math.abs(arr[i] - arr[j]);
                if (x > maxDiff) {
                    maxDiff = x;
                    p1 = arr[i];
                    p2 = arr[j];
                }
            }
        }

        return new int[]{p1, p2};
    }


}
