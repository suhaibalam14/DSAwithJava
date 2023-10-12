package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDec {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
