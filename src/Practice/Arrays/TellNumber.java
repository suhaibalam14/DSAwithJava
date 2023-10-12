package Practice.Arrays;

import java.util.Scanner;

public class TellNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Input a number of your choice: ");
        int num = sc.nextInt();

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == num) {
                System.out.println("Number exist");
                break;
            }
            else
                System.out.println("Number does not exist");
            break;

        }

    }
}
