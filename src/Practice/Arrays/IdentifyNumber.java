package Practice.Arrays;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc= new Scanner(System.in);
        for (int i = 0 ; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                positive++;
            else
                negative++;

            if (arr[i]%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(even);
        System.out.println(odd);


    }



}
