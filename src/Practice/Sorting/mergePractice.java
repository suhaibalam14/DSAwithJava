package Practice.Sorting;

import java.util.Arrays;

public class mergePractice {
    static void sort(int[] arr, int s, int e){
        if (e-s == 0)
            return;
        int mid = s+(e-s)/2;
        sort(arr, s, mid);
        sort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,6,2,1};
        sort(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
}
