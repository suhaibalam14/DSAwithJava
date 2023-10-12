package recursion;

import java.util.Arrays;

public class InplaceMergeSort {
    static void inPlaceSort(int[] arr , int s, int e){

        if (e-s == 1)
            return;

        int mid = s+(e-s)/2;
        inPlaceSort(arr,0,mid);
        inPlaceSort(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {

        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

         while (i<mid && j<e){
             if (arr[i]  < arr[j]){
                 mix[k] = arr[i];
                 i++;
             }else {
                 mix[k] = arr[j];
                 j++;
             }
             k++;
         }

         while (i<mid){
             mix[k] = arr[i];
             i++;
             k++;
         }

         while (j<e){
             mix[k] =arr[j];
             j++;
             k++;
         }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6,5};
        inPlaceSort(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
