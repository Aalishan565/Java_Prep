package _3_string_problems;

public class _2_ReverseStringSentence {

    public static void main(String[] args) {
        String input = "I live in india";
        String[] inputArray = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            output.append(inputArray[i]).append(" ");
        }
        System.out.println(output.toString().trim());
    }
    
}
