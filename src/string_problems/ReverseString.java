package string_problems;

public class ReverseString {
    public static void main(String[] args) {
        String input = "aalishan";

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
