package rough;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // int sqrt =(int) Math.sqrt(N);
        // System.out.println(sqrt);

        int start = 0;
        int end = N;
        int root= 0;

        while (start<=end){
            int mid = (start+end)/2;

            if(mid * mid == N){
                root =mid;
               break;
            }
            else if(mid * mid > N){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
            root = mid;
        }
        System.out.println(root);

    }
}
