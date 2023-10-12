package Gocode;

public class OrdPrime {
    public static void main(String[] args) {

        printPrime(50);

    }

    static boolean checkPrime(int n) {

        for (int j = 2; j < n / 2; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    static void printPrime( int n) {
        for (int j = 2; j <= n; j++) {
            if (checkPrime(j))
                System.out.print(j + " ");
        }
    }
}
