package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("{(})"));
    }

    static boolean isBalanced(String s) {
        // Write your code here

        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] strArr = s.toCharArray();

        for (char c : strArr) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                switch (c) {
                    case ')':
                        if(stack.peek() == '(') stack.pop();
                    case ']':
                        if(stack.peek() == '(') stack.pop();
                    case '}':
                        if(stack.peek() == '{') stack.pop();
                }
            }
        }


            if (stack.size()> 0) {
                return false;
            }

        return true;
    }
}
