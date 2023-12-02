package Array;

public class SetZero {
    static void setZero(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    doZero(matrix,i,j);

                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE)
                        matrix[i][j] = 0;
            }
        }
    }

    private static void doZero(int[][] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][b] != 0)
              arr[i][b] = Integer.MAX_VALUE;
        }

        for (int j = 0; j < arr[0].length; j++) {
            if (arr[a][j] != 0)
                arr[a][j] =Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,0},
                {2,7},
                {5,0},
                {4,8}
        };
        setZero(arr);
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
