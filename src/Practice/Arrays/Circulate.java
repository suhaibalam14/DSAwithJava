package Practice.Arrays;

import java.util.Arrays;

public class Circulate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        cirulate(arr);
    }
    static void cirulate(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1 ; i>0 ; i--) {
            arr[i] =  arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
