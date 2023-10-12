package Practice.Arrays;

public class DigitSum {
    static int digitSum(int num){
        if (num==0)
            return 0;
       return num%10 + digitSum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(123456));
    }
}
