package Array;

public class SumDandB {
    static int sumDandB(int[][] mat) {
        int rowLowLim = 0;
        int rowUpLim = mat.length - 1;
        int colLowLim = 0;
        int colUpLim = mat[0].length - 1;
        int sum = 0;

        for (int i = colLowLim; i <= colUpLim; i++) {
           sum += mat[colLowLim][i];
        }
        rowLowLim++;

        for (int i = rowLowLim; i <= rowUpLim; i++) {
            sum += mat[i][colUpLim];
        }
        colUpLim--;

        for (int i = colUpLim; i >= colLowLim; i--) {
            sum += mat[rowUpLim][i];
        }
        rowUpLim--;


        for (int i = rowUpLim; i >= rowLowLim; i--) {
            sum += mat[i][colLowLim];
        }

        for (int i = 1; i < mat.length-1; i++) {
            sum += mat[i][i];
        }
        for (int i = 1; i < mat.length-1; i++) {
            sum += mat[i][mat.length-i-1];
        }

        if (mat.length%2 != 0)
            return sum - mat[mat.length/2][mat.length/2];

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},

        };
        System.out.println(sumDandB(arr));

    }
}
