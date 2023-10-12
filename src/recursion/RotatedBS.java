package recursion;

public class RotatedBS {
    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid])
                return binarySearch(arr, target, s, mid - 1);
            return binarySearch(arr, target, mid + 1, e);
        }
        if (target >= arr[mid] && target <= arr[e])
            return binarySearch(arr, target, mid + 1, e);
        return binarySearch(arr, target, s, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,1,2,3};
        System.out.println(binarySearch(arr, 8, 0, (arr.length)-1));
    }

}
