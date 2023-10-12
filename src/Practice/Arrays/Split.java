package Practice.Arrays;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length/2; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[arr.length/2 + i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}
