package Practice.Sorting;

import java.util.Arrays;

public class CycleSort {
    static void cycle(int[] arr){
        for (int i = 0; i < arr.length; ) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,1,2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
