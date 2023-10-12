package OOPs.LambdaExpression;

public class lambdaFunctionOneParameter {
    public static void main(String[] args) {
        Interface2 in = x -> 2 * x;
        System.out.println(in.doubleIt(5));
    }

}

interface Interface2{
    int doubleIt(int x);
}
