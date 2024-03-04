package Stack;
public class StackMain {
    public static void main(String[] args) throws StackEmptyException {
//        CustomStack stack = new CustomStack();
//
//        for (int i = 1; i <= 10 ; i++) {
//            stack.push(i);
//        }
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek());
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(stack.pop());
//        }
//        stack.push(100);
//        System.out.println(stack.size());
//        DynamicStack stk = new DynamicStack();
//        for (int i = 1; i<= 20 ; i++) {
//            stk.push(i);
//        }
//        for (int i = 1; i<= 20 ; i++) {
//            System.out.println(stk.pop());
//        }
        CustomStack input = new CustomStack(10);
        for (int i = 1; i <= 10 ; i++) {
            input.push(i);
        }
        CustomStack extra = new CustomStack(10);

        input.display();
        reverseStack( input, extra);
        System.out.println();
        input.display();

}

    private static void reverseStack(CustomStack input, CustomStack extra) throws StackEmptyException {
        if (input.isEmpty()){
            return;
        }
        int x = input.pop();
        reverseStack(input, extra);
        extra.push(x);
        input.push(extra.pop());

    }
}
