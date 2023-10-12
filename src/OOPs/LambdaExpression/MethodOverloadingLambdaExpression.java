package OOPs.LambdaExpression;

public class MethodOverloadingLambdaExpression {

    public static void main(String[] args) {


        Interfaced sum = (a, b) -> a + b;
        Interfaced sub = (a, b) -> a - b;
        Interfaced mul = (a, b) -> a * b;

        //System.out.println(sum.operation(2,5));
        MethodOverloadingLambdaExpression calci = new MethodOverloadingLambdaExpression();
        int x = calci.operate(20,5,sub);
        System.out.println(x);
        int y = calci.operate(2,5,sum);
        System.out.println(y);
        int z = calci.operate(2,5,mul);
        System.out.println(z);

    }
    private int operate(int a ,int b, Interfaced op){
        return op.operation(a,b);
    }
}

interface Interfaced{
    int operation(int a, int b);
}