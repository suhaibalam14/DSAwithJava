package rough;

public class PascalTriangle {
    static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(NCR(i, j) + " ");
            }
            System.out.println();
        }

    }

    static long NCR(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
            pascalTriangle(10);
    }
}
