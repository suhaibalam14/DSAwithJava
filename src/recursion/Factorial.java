package recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(sum(6));
        System.out.println(fact(6));
    }

    static int fact(int n) {
        if (n==1){
            return 1;
         }
        return n* fact(n-1);
    }
    static int sum(int n) {
        if (n==1){
            return 1;
         }
        return n+ sum(n-1);
    }


}
