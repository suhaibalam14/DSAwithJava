package Practice.Arrays;

import java.util.Scanner;

public class ProSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(sum(arr));
        System.out.println(product(arr));
    }

    private static long product(int[] arr) {
            int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];
        }
        return pro;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
