package Practice.Arrays;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] newArray = new int[4];
        for (int i = 4; i < 8 ; i++) {
           newArray[i-4] =  arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
