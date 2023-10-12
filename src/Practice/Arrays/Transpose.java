package Practice.Arrays;

public class Transpose {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
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
}
