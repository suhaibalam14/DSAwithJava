package Gocode;


public class Palindrome {
    static boolean pal(int n) {
        int m = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == m) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(pal(121));
    }
}
