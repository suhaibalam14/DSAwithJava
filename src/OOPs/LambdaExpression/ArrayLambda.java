package OOPs.LambdaExpression;

import java.util.ArrayList;

public class ArrayLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i*2);
        }

        list.forEach(n-> System.out.println(n));
        System.out.println("------------------------*------------------------");
        list.forEach(n -> {
            if (n%3==0) {
                System.out.println(n);
            }
        });


    }
}
