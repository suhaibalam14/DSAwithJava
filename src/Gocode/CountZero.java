package Gocode;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(50000));
    }

    private static int count(int n) {
       
        int count = 0;
        while (n>0){
            if (n%10 == 0){
                count++;
            }

        }
        return count(n/10);
    }
}
