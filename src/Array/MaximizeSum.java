package Array;

public class MaximizeSum {
    public static int maxSum(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr2.length && j < arr1.length) {
            sum += arr2[i];
            i++;
            while(find(arr2[i], arr1)) {
                sum += arr2[i];
                i++;
            }
            sum += arr1[j+1];
            j++;
            while(find(arr1[j], arr2)) {
                sum += arr1[j];
                j++;
            }
        }
        while(i< arr2.length){
            sum += arr2[i];
            i++;
        }
        while(j< arr1.length){
            sum += arr1[j];
            j++;
        }
        return sum;
    }

    static boolean find(int i, int[] arr1) {
        for (int k : arr1) {
            if (i == k)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,4,6,9,18,25};
        int[] arr2 = new int[]{2,6,9,12,18,20,40,60};
        int x = maxSum(arr1, arr2);
        System.out.println(x);
    }
}
