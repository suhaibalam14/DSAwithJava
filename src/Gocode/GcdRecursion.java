package Gocode;

public class GcdRecursion {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }

     static int gcd(int a, int b) {
        if (a==0)
            return b;
       
        return gcd(b%a, a);
    }
}
