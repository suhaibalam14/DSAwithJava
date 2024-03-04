package Classroom.practice;

import java.util.Stack;

public class CountBracketReversals {
    public static void main(String[] args) {
        String str = "}}}{{{";
        System.out.println(countBracketReversals(str));
    }
    public static int countBracketReversals(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{')
                stack.push(str.charAt(i));
            else{
                if (stack.isEmpty() || stack.peek() == '}')
                    stack.push(str.charAt(i));
                else
                    stack.pop();
            }
        }
        if (stack.size() % 2 == 1)
            return -1;
        int count = 0;
        while(!stack.isEmpty()){
            char c1 = stack.pop();
            char c2 = stack.pop();

            if(c1 == c2)
                count += 1;
            else
                count += 2;
            }
        return count;
        }
}
