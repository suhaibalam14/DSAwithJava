package Gocode;

public class Patterns {

    public static void main(String[] args) {

        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern31(5);


    }

    //Pattern 1
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 2
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 3
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    //Pattern 4
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = row; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 4
    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = n > row ? row : 2 * n - row;
            for (int cols = 1; cols <= totalCol; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 6
    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = n > row ? row : 2 * n - row;

            int totalSpace = n - totalCol;
            for (int space = 0; space < totalSpace; space++) {
                System.out.print(" ");

            }

            for (int cols = 1; cols <= totalCol; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 7

    static void pattern7(int n) {

        for (int i = 0; i < 2 * n; i++) {
            int totalCols = n > i ? i : 2 * n - i;
            int totalSpace = n - totalCols;

            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern 8

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Pattern 9

    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // pattern 10

    static void pattern10(int n) {

        for (int i = 1; i < 2 * n; i++) {

            int totalCols = n > i ? i : 2 * n - i;
            int totalSpace = n - totalCols;

            for (int j = 1; j <= totalSpace; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= totalCols; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
