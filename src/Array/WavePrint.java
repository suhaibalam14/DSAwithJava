package Array;

public class WavePrint {
    static void wavePrint(int[][] mat){
        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;


        while(left <= right){
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
            if (left > right)
                return;
            for (int i = bottom; i >=top ; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,10,11,20,21},
                {2,9,12,19,22},
                {3,8,13,18,23},
                {4,7,14,17,24},
                {5,6,15,16,25}
        };
        wavePrint(arr);
    }

}
