package Practice.Sorting;

public class Inversion {
    static int getInversion(int[] arr){
        int inversion = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            inversion += min_idx - i;
        }
        return inversion;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,11,5,1};
        System.out.println(getInversion(arr));
    }
}