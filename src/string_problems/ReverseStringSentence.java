package string_problems;

public class ReverseStringSentence {
    public static void main(String[] args) {
        String input = "I live in india";
        String inputArray[] = input.split(" ");
        String output = "";
        for (int i = inputArray.length - 1; i >= 0; i--) {
            output += inputArray[i] + " ";
        }
        System.out.println(output);
    }
}
