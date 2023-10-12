package OOPs.LambdaExpression;

public class lambdaFunctionTwoParameter {

    public static void main(String[] args) {
        Interface1 in =(a, b) -> a+b;
        System.out.println( in.sum(5,2));

    }

}

interface Interface1 {
    int sum(int a, int b);
}