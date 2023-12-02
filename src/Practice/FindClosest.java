package Practice;

public class FindClosest {
    static int findClosest(int[] nums, int target){
        int index = -1;
        int binaryIndex = binarySearch(nums, target);
        if (binaryIndex != -1) {
            if (target == nums[binaryIndex])
                return binarySearch(nums, target);
        }
        int diff = Math.abs(target - nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(target-nums[i]) < diff){
                    diff = Math.abs(target-nums[i]);
                    index = i;
               }

        }

        return index;
    }
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
        int[] arr = new int[]{1,3,7,9,11,12,45};
        System.out.println(findClosest(arr, 4));
    }
}
