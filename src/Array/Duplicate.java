package Array;

import java.util.Arrays;

public class Duplicate {
    static int dupNumber(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,7,6,5,4,2,4,1};
        System.out.println(dupNumber(arr));
    }
}
