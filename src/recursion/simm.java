package recursion;

public class simm {
    public static void main(String[] args) {
    int n = 3;
    print(n);
    }
    static void print(int n){
        if (n<0)
            return;
        if (n==0) {
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.println(n + " ");
    }
}
