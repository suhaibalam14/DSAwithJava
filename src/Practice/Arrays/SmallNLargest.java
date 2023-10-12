package Practice.Arrays;

public class SmallNLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(smallest(arr));
        System.out.println(largest(arr));

    }
    static int largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] > arr[i])
                largest= arr[i+1];
        }
        return largest;
    }
    static int smallest(int[] arr){
        int smallest = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] < arr[i])
                smallest= arr[i+1];
        }
        return smallest;
    }

}
