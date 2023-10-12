package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StoreReverse {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
          arr1[arr.length-1-i] =  arr[i];
        }

        System.out.println(Arrays.toString(arr1));
    }
}
