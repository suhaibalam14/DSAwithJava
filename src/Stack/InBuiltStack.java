package Stack;

import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 10 ; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(stack.pop());
        }
    }
}
