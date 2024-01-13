package Classroom.practice;

public class SplitArray {
    public static boolean splitArray(int[] arr){
        return helper(arr, arr.length, 0, 0, 0);
    }
    public static boolean helper(int[] arr, int n, int start, int lSum, int rSum){
        if(n == start)
            return lSum == rSum;
        if(arr[start]%5 == 0){
            lSum += arr[start];
        }else if(arr[start]%3 == 0)
            rSum += arr[start];
        else{
            return helper(arr, n, start+1, lSum + arr[start], rSum) || helper(arr, n, start + 1, lSum, rSum + arr[start]);
        }
        return helper(arr, n, start + 1, lSum, rSum);
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,4,3};
        System.out.print(splitArray(arr));
    }
}
