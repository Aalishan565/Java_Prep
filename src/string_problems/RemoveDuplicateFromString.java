package string_problems;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String input = "aabbccdd";
        String result = "";
        for (int i = 0; i < input.length() - 1; i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(result);
    }

}
