package Stack.Question;

import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else {
                if (s.charAt(i) == ')') {
                    if (s.isEmpty() || stack.pop() != '(')
                        return false;
                }
                if (s.charAt(i) == '}') {
                    if (s.isEmpty() || stack.pop() != '{')
                        return false;
                }
                if (s.charAt(i) == ']') {
                    if (s.isEmpty() || stack.pop() != '[')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static int minInsertions(String str){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                stack.push(ch);
            else {
                if(i+1 < str.length() && str.charAt(i+1) == ')')
                    i++;
                else
                    count++;
                if (!stack.isEmpty())
                    stack.pop();
                else count++;
            }
        }
        count += 2*stack.size();
        return count;
    }
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
        System.out.println(minInsertions(str));
    }
}
