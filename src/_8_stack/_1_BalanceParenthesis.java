package _8_stack;

import java.util.Stack;


public class _1_BalanceParenthesis {

    public static void main(String[] args) {
        System.out.println(balanced("({[]})"));
    }

    public static boolean balanced(String s) {
        Stack<Character> list = new Stack();
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!list.empty() && (list.peek() == '(' && s.charAt(i) == ')'
                    || list.peek() == '[' && s.charAt(i) == ']'
                    || list.peek() == '{' && s.charAt(i) == '}')) {
                list.pop();
            } else {
                list.add(s.charAt(i));
            }
        }
        return list.empty();
        /* if(list.empty()){return true;}else{ return false;}*/
    }
}
