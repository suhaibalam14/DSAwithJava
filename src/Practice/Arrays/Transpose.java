package Practice.Arrays;

import java.util.Arrays;

public class Transpose {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = transpose(arr);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println(isTranspose(arr));
    }

    static boolean isTranspose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] transpose(int[][] mat) {
        // Write your code here
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = mat[j][i];
            }
        }
        return mat;
    }

}
