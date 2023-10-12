package Practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
            for (int j = i+1; j > 0; j--)
                if (arr[j-1]>arr[j])
                        swap(arr, j-1, j);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,4,3,7,9,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

}
