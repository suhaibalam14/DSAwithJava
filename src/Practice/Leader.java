package Practice;

import java.util.Arrays;

public class Leader {
    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        int[] arr1 = new int[input.length];
        int k = 0;
        boolean b;
        for (int i = 0; i < input.length; i++) {
            b = true;
            for (int j = i + 1; j < input.length; j++) {
                if(input[i] < input[j]){
                    b = false;
                    break;
                }
            }
            if(b)
                arr1[k++] = input[i];
        }
        Arrays.sort(arr1, 0, k);
        for (int i = 0; i < k; i++) {
            System.out.print( arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,12,34,2,0,-1};
        leaders(arr);
    }
}
