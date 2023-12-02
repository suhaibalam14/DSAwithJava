package Array;

import java.util.Arrays;

public class RowTraversal {
    static int[] rowTraversal(int[][] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                count++;
            }
        }

        int [] arr = new int[count];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arr[k++] = a[i][j];
            }
        }
        return arr;
    }
    static int[] colTraversal(int[][] arr){
        int [] a = new  int[arr.length * arr[0].length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                a[k++] = arr[j][i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2},
                {4,5},
                {7,8}
        };
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(rowTraversal(arr)));
        System.out.println(Arrays.toString(colTraversal(arr)));
    }
}
