public class GcdOrdinary {
    public static void main(String[] args) {
//        System.out.println(gcd(8, 10));
//        System.out.println(lcm(8, 10));

        System.out.println(lcm2(4,8));

    }

    static int gcd(int a, int b) {

        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    static int lcm(int a , int b){
        int lcm = (a*b)/gcd(a,b);
        return lcm;
    }

    static int lcm2(int a , int b){
        int result = Math.max(a, b);
        while (true){
            if (result%a == 0 && result%b==0){
                break;
            }
            result++;
        }
        return result;
    }

}
