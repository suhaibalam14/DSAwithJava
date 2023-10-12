package Gocode;

public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,9,1,2,3,4};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique = 0;

        for (int i = 0; i < arr.length; i++) {
                unique^= arr[i];
        }
        return unique;
    }
}
