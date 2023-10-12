package Gocode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(0));
    }

    private static boolean powerOfTwo(int n) {
        if (n == 0)
            return false;
        return (n & (n-1)) == 0;
    }
}
