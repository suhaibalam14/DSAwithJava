package recursion;

public class Solution {

    public static int sum(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return sumArray(input, input.length - 1, 0);
    }

    static int sumArray(int[] arr, int n, int index) {
        if (index == n+1)
            return 0;
        return arr[index] + sumArray(arr, n, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr));
    }

}