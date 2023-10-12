package recursion;


public class CountZeroes {
    static int count1(int n){
        if (n==0)
            return 1;
        int count = 0;
        while (n!=0){
            if (n%10 == 0)
                count++;
            n/=10;
        }
        return count;
    }

    static int count2(int n){

        return helper(n,0);
    }
    static int helper(int n , int count){
        if (n==0) {
            return count;
        }

        if (n%10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n/10, count);
    }

    public static void main(String[] args) {
        System.out.println(count2(10002500));
    }
}
