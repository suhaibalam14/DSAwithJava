package Classroom;
//
//import java.util.Arrays;
//
//public class Solution {
//    public static void sort012(int[] arr){
//        //Your code goes here
//        int start = 0;
//        int end = arr.length - 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0){
//                swap(arr, i, start);
//                start++;
//            }
//            if(arr[i] == 2){
//                swap(arr, i, end);
//                end--;
//            }
//        }
//    }
//    static void swap(int[] arr, int first, int second){
//        int tmp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = tmp;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,1,2,0,1,2,0,1,2,2,0};
//        sort012(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//public class Solution {
//
//    public static int arrayEquilibriumIndex(int[] arr){
//        //Your code goes here
//        int leftSum = 0;
//        int rightSum = 0;
//        for (int i = 1; i < arr.length; i++) {
//            rightSum += arr[i];
//        }
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if(leftSum == rightSum)
//                return i;
//            leftSum += arr[i];
//            rightSum -= arr[i+1];
//
//        }
//        return -1;
//    }
public class Solution {

    public static int findUnique(int[] arr) {
        //Your code goes here
        int unique = 0;
        for (int element : arr) {
            unique ^=element;
        }
        return unique;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,3,2,4,3,1,2};
        System.out.println(findUnique(arr));
    }
}