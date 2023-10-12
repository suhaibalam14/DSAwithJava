package Gocode;

public class binarySearch {
    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;

        while (start<=end){
            int mid = start+(end - start)/2;
            if (target<arr[mid])
                end = mid-1;
            else if (target>arr[mid])
                start= mid+1;
            else
                return mid;
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,9,10,13,15,49,59,89,99,100};
        int x =binarySearch(arr,25);
        System.out.println(x);
     }
}
