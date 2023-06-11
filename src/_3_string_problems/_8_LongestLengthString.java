package _3_string_problems;

public class _8_LongestLengthString {

    public static void main(String[] args) {
        String input = "I am a developer";
        String[] inputArray = input.split(" ");
        int counter;
        int maxLength = 0;
        String ch = null;
        for (String s : inputArray) {
            counter = s.length();
            if (counter > maxLength) {
                maxLength = counter;
                ch = s;
            }
        }
        System.out.println(maxLength);
        System.out.println(ch);
    }

}
