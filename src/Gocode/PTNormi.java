package Gocode;// Print Pascal's Triangle in Java

class PTNormi {

    // Pascal function
    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}