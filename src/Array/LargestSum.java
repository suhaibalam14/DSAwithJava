package Array;

public class LargestSum {
    static void largestSum(int[][] mat){

        int[] arr1 = largestColSum(mat);
        int[] arr2 = largestRowSum(mat);
        if(arr1[0] > arr2[0]){
            System.out.println("Column" +" "+ arr1[1] +" "+ arr1[0]);
        }else{
            System.out.println("Row" +" "+ arr2[1] +" "+ arr2[0]);
        }

    }

     static int[] largestRowSum(int[][] arr) {
      //  int sum = 0;
        int largestSum = 0;
        int rowNum = 0;
         for (int i = 0; i < arr.length; i++) {
             int sum = 0;
             for (int j = 0; j < arr[0].length; j++) {

                 sum += arr[i][j];
             }
             if (sum>largestSum) {
                 largestSum = sum;
                 rowNum = i;
             }
         }
        return new int[]{largestSum, rowNum};
    }

     static int[] largestColSum(int[][] arr) {

         int largestSum = 0;
         int colNum = 0;
         for (int i = 0; i < arr[0].length; i++) {
             int sum = 0;
             for (int j = 0; j < arr.length; j++) {
                 sum += arr[j][i];
             }
             if (sum>largestSum) {
                 largestSum = sum;
                 colNum =i;
             }
         }
         return new int[]{largestSum, colNum};
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,9},
                {4,5,6},
                {1,2,4},
                {1,2,4}
        };
        largestSum(arr);
    }
}
