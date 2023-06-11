package _3_string_problems;

public class _6_RemoveDuplicateFromString {

    public static void main(String[] args) {
        String input = "aalishan";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!result.toString().contains(String.valueOf(input.charAt(i)))) {
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);
       // System.out.println(result.charAt(result.length()-1));
    }


}
