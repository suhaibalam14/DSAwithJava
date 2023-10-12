package Gocode;

import java.util.Arrays;

public class GoogleRev {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        flipAndInvert(arr);
//        for (int[] row : arr) {
//            System.out.println(Arrays.toString(row));
//        }
        for (int[] row : arr){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void flipAndInvert(int[][] image) {

        for (int[] row : image) {
            for (int i = 0; i <= (row.length) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
    }
}
