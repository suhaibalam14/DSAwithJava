package Gocode;

public class FindNCR {
    public static void main(String[] args) {
        System.out.println( NcR(5,1));
    }
    static int NcR(int n, int r){
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= n-i;
            res /=i+1;
        }
        return res;
    }
}
