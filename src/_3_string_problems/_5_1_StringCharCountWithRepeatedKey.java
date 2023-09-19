package _3_string_problems;

public class _5_1_StringCharCountWithRepeatedKey {
    public static void main(String[] args) {
        String input = "aallishann";
        StringBuilder result = new StringBuilder();
        char prevChar = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                result.append(prevChar).append(count);
                prevChar = currentChar;
                count = 1;
            }
        }
        // Append the last character and its count
        result.append(prevChar).append(count);
        System.out.println(result);
    }
}
