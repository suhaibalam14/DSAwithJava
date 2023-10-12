package Gocode;

public class Fiboo {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }

    }
    static int fibo(int n ){

        if ( n == 0) {
            return 0;
        }
        else if (n == 1){
            return  1;
        }
        return fibo(n-1 ) + fibo(n-2);
    }
}
