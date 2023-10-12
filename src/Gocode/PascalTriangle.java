package Gocode;

public class PascalTriangle {
    public static void main(String[] args) {

        pascal(10);

        //   System.out.println(fact(0));


    }

    static int NcR(int n, int r){
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= n-i;
            res /=i+1;
        }
        return res;
    }
    static void pascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
              System.out.print(NcR(i,j) + " ");
            }
            System.out.println();
        }
    }

}
