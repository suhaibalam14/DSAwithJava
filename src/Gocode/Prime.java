package Gocode;

public class Prime {
    static void printPrime(long a , long b){
        for (long i = a; i <= b; i++) {
            if(checkPrime(i))
                System.out.println(i);
        }
    }
    static boolean checkPrime(long n){
        if (n<2)
            return false;
        for (long i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        printPrime(92233720368547758L,9223372036854775807L);
    }
}
