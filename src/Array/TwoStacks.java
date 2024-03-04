package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStacks {
    public static int twoStacks(int x , int[] a, int[] b){
        return twoStacks(x,a,b,0,0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x)
            return  count;
        if (a.length == 0 || b.length == 0)
            return count;
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1,a.length),b, sum + a[0], count+1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1,b.length), sum + b[0], count+1);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of test cases");
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter size of first array");
            int n = s.nextInt();
            System.out.println("Enter size of first array");
            int m = s.nextInt();
            System.out.println("Enter the sum not to exceed");
            int x = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            System.out.println("Enter elements for array 1 of size "+ n);
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            System.out.println("Enter elements for array 2 of size "+ m);
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println("The max of the score is : " + twoStacks(x, a, b));
        }
    }
}
