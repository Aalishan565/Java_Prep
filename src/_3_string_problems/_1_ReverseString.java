package _3_string_problems;

public class _1_ReverseString {

    public static void main(String[] args) {
        String input = "aalishan";
        reverseString(input);
    }

    private static void printInReverse(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

    private static void reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);

        }
        System.out.print(reversed);
    }

}
