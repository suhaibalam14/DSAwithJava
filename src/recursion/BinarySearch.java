package recursion;

public class BinarySearch {
    static int binary(int[] arr, int target, int start, int end){
        if (start>end)
            return -1;
        int mid = start+(end- start)/2;
        if (arr[mid] == target)
            return mid;
        else if (target<arr[mid]) {
            return binary(arr, target, start, mid-1);
        }
        else {
            return binary(arr, target, mid+1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,3,5,6,7,8,12,34,56};
        System.out.println(binary(arr, 6, 0, arr.length - 1));
    }

}
