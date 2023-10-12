package rough;

public class MethodOverloading {

    static  int sum(int a, int b){
        return a+b;
    }

    static  double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println( sum(2,3));
        System.out.println(sum(2.0,3.0));
    }

}
