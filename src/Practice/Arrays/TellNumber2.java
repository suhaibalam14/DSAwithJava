package Practice.Arrays;

import java.util.Scanner;

public class TellNumber2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input a number: ");
                int num = sc.nextInt();

                if (isExist(num,arr))
                    System.out.println("Number exist");
                else
                    System.out.println("Number does not exist");
    }

    static boolean isExist(int n, int[] arr){
        for(int i= 0 ; i< arr.length ; i++){
            if(arr[i] == n)
                return true;
        }
        return false;
    }

}
