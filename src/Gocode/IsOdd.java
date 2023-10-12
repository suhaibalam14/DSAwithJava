package Gocode;

public class IsOdd {
    public static void main(String[] args) {

        System.out.println(isOdd(50));
    }

    private static boolean isOdd(int n)
    {
        return (n & 1) == 1;
    }
}
