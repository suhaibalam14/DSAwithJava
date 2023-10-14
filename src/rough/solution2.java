package rough;

import java.util.Arrays;

public class solution2 {

    public static void main(String[] args) {
       int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(reverseBetween(1,6,arr)));
    }

        public static int[] reverseBetween(int l, int r, int[] arr) {
            // Write your code from here.
            for (int i = 0; i < (r-l+1)/2 ; i++) {
                swap(arr, l+i, r-i);
            }
            return arr;
        }
        static void swap(int[] arr, int a , int b){
            int temp = arr[a];
            arr[a] =arr[b];
            arr[b] = temp;
        }
    }

