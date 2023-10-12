package OOPs.LambdaExpression;

public class lambdaFunctionZeroParameter {
    public static void main(String[] args) {
       // Interface s = () -> "Hello! how are you";
       // System.out.println(s.in());

        Interface s1 = () -> System.out.println("hi");
        s1.in1();
    }

    interface Interface{
        //String in();
        void in1();
    }

}
