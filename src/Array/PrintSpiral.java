package Array;

public class PrintSpiral {
    static void printSpiral(int[][] matrix){

        int elements = matrix.length * matrix[0].length;
        int rowLowLim = 0;
        int rowUpLim = matrix.length-1;
        int colLowLim = 0;
        int colUpLim = matrix[0].length-1;

        while(elements > 0){

            for (int i = colLowLim ; i <= colUpLim; i++) {
                System.out.print(matrix[colLowLim][i] + " ");
                elements--;
            }
            rowLowLim++;
            for (int i = rowLowLim; i <= rowUpLim ; i++) {
                System.out.print(matrix[i][colUpLim] + " ");
                elements--;
            }
            colUpLim--;
            if (rowLowLim <= rowUpLim) {
                for (int i = colUpLim; i >= colLowLim; i--) {
                    System.out.print(matrix[rowUpLim][i] + " ");
                    elements--;
                }
                rowUpLim--;
            }
                if (colLowLim <= colUpLim) {
                    for (int i = rowUpLim; i >= rowLowLim; i--) {
                        System.out.print(matrix[i][colLowLim] + " ");
                        elements--;
                    }
                    colLowLim++;
                }
        }
    }

    public static void main(String[] args) {
//        int[][] arr = new int[][]{
//                {1, 2, 3, 4, 5},
//                {16,17,18,19,6},
//                {15,24,25,20,7},
//                {14,23,22,21,8},
//                {13,12,11,10,9},
//
//        };

        int[][] arr = new int[][]{
                {1,2,3,4,5}
        };
        printSpiral(arr);
    }
}
