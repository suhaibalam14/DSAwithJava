package Practice.Arrays;

import java.util.Arrays;

public class TwoD_Dec {

    public static void main(String[] args) {
        int [][] arr = new int[][]{
                                   {12,44,5,54,3},
                                   {3,5,66,3},
                                   {4,3,9,2,59,6,63},
                                   {56,66,2,}
        };

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for (int[] array: arr) {
            System.out.println(Arrays.toString(array));

        }

    }
}
