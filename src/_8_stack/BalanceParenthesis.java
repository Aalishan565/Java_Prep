package _8_stack;

import java.util.Stack;


public class BalanceParenthesis {

    public static void main(String[] args) {
        System.out.println(balanced("({[]})"));
    }

    public static boolean balanced(String s) {
        Stack<Character> list = new Stack();
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (list.empty() == false && (list.peek() == '(' && s.charAt(i) == ')'
                    || list.peek() == '[' && s.charAt(i) == ']' || list.peek() == '{' && s.charAt(i) == '}')) {
                list.pop();
            } else {
                list.add(s.charAt(i));
            }
        }

        if (list.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
