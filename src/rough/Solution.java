package rough;//package rough;
//
//import java.util.Scanner;
//public class demo
//{
//    public static void main(String[] args)
//    {
//        // write your code logic here !!
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0 ; j < N; j++) {
//                char c = (char)('A' + i);
//                System.out.print(c);
//            }
//            System.out.println();
//        }
//
//
//
//    }
//}


//import java.util.Scanner;
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        // write your code logic here !!
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0 ; j <= i; j++) {
//                char c = (char)('A' + N - 1 - i + j);
//                System.out.print(c + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Your class should be named Solution.
//         * Read input as specified in the question.
//         * Print output as specified in the question.
//         */
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 1; i <= N; i++) {
//
//            for (int j = 1; j <= N-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i ; j++) {
//                System.out.print(i + j);
//            }
//
//            for (int j = 0 ; j < i-1 ; j++) {
//                System.out.print(2*(i-1)-j);
//            }
//            System.out.println();
//        }
//
//    }
//}

//
//import java.util.Scanner;
//
//public class Solution {
//
//
//    public static void main(String[] args) {
//        /* Your class should be named Main.
//         * Read input as specified in the question.
//         * Print output as specified in the question.
//         */
//
//        // Write your code here
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for (int i = 1; i < 2*N; i++) {
//
//            int ts = N>i ? i : 2*N-i ;
//
//            for (int j = 1; j < ts; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = ts; j <= N ; j++) {
//                System.out.print(j + " ");
//            }
//
//            System.out.println();
//        }
//
//    }
//
//}



import java.util.Scanner;

//public class Solution {
//
//
//    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = n/2;
//        for (int i = 0; i <= 2 * m; i++) {
//            int tSpace = m > i ? m-i : i-m;
//            for (int j = 0; j < tSpace; j++) {
//                System.out.print(" ");
//            }
//            int tCols = n - tSpace*2;
//            for (int j = 0; j < tCols; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        pattern28(9);
//
//    }
//    static void pattern28(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//            int totalColsInRow = row > n ? 2 * n - row: row;
//
//            int noOfSpaces = n - totalColsInRow;
//            for (int s = 0; s < noOfSpaces; s++) {
//                System.out.print(" ");
//            }
//
//            for (int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Solution {
//    public static int a = 245;
//
//    public static void main(String[] args) {
//        f();
//        System.out.println(a);
//    }
//
//    public static void f() {
//        int a = 12;
//        f2();
//    }
//    public static void f2() {
//        int a = 16;
//        a=a+1;
//
//    }
//}

public class Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,6,5,4,7,8};
        int x =secondLargestElement(arr,1);
        System.out.println(x);
    }

    public static int secondLargestElement(int[] arr, int n) {
        //Your code goes here
        int largest = arr[0];
        int secLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest<arr[i]){
                largest= arr[i];
            }

        }
        System.out.println(largest);

        for (int i = 1; i < arr.length; i++) {
            if(secLargest<arr[i] && secLargest<largest)
                secLargest = arr[i];
            System.out.println(secLargest);
        }
        return secLargest;
    }

}