package Practice.Arrays;

public class MirrorArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,2,1};
        int[] arr1 = new int[]{1,2,4,3,2,1};
        System.out.println(isMirror(arr));
        System.out.println(isMirror(arr1));

    }

    private static boolean isMirror(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-i-1])
                return false;
        }
        return true;
    }
}
