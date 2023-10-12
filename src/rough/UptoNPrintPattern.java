package rough;//package rough;
//
//public class UptoNPrintPattern {
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    static void pattern(int n){
//        for (int i = 1; i <= n; i++) {
//            int x = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(x++);
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;

public class UptoNPrintPattern
{
    public static void main(String ar[])
    {

        // write your code logic here !!!
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            for (int j = N; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}