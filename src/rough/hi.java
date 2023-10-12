package rough;

import java.math.BigInteger;

public class hi {


        public static void fact(int n) {
            // Write your code here
            if (n < 0) {
                return;
            }
            if (n == 0) {
                System.out.println(1);
            } else {
                BigInteger fact = BigInteger.ONE;
                for (int i = 1; i <= n; i++) {
                    fact = fact.multiply(BigInteger.valueOf(i));
                }
                System.out.println(fact);
            }
    }

//
//    public static void fact(int n) {
//
//        // Write your code here
//        if(n==0){
//            System.out.println(1);
//        }else{
//            double fact = 1L;
//            for (int i = 1; i <= n; i++) {
//                fact = fact * i;
//            }
//            System.out.println(fact);
//        }
//    }
//
    public static void main(String[] args) {

        BigInteger A = BigInteger.valueOf(100);
        A = A.multiply(BigInteger.valueOf(5));
        System.out.println(A);


        fact(5);

    }
}