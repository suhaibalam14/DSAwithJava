package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(7342));
    }

    private static int sumOfDigit(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigit(n / 10);
    }
}
