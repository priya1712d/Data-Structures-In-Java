package practice;

import java.util.HashMap;
import java.util.Stack;

/**
 * You're given a string consisting solely of (, ), and *.
 * * can represent either a (, ), or an empty string.
 * Determine whether the parentheses are balanced
 *
 *
 * Solution - ((  )
 * Solution with *s - *)
 */
public class BalancedParanthesis {
    public static void main(String[] args) {
        char[] chars = { '(', '(', '*', ')'};
        System.out.println(balancedP(chars));
    }

    private static boolean balancedP(char[] charArr){

        Stack<Character> sc = new Stack<>();
        int countOfStars = 0;

        if(charArr.length == 0){
            return true;
        }

        if(charArr.length == 1){
            return false;
        }

        if(charArr[0] == ')'){
            return false;
        }
        for (char spl : charArr) {
            if (sc.isEmpty() && spl == '(') {
                sc.push(spl);
            } else if (spl == '*') {
                countOfStars++;
            } else if (spl == ')') {
                if(sc.isEmpty()){
                    return false;
                }
                sc.pop();
            }
        }

        return sc.isEmpty() || (sc.size() == countOfStars);
    }
}
