package recursion;

public class countZero {
    public static int countZerosRec(int input) {
        // Write your code here
        if (input == 0)
            return 1;
        else
            return count(input);
    }

    static int count(int n) {
        if (n == 0)
            return 0;
        int lastDigit = n % 10;
        if (lastDigit == 0)
            return 1 + count(n / 10);
        else
            return count(n / 10);
    }

    public static void main(String[] args) {
        int x = 202084488;
        int d = countZerosRec(x);
        System.out.println(d);
    }
}
