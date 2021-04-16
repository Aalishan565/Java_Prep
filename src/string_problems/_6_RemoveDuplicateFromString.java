package string_problems;

public class _6_RemoveDuplicateFromString {

    public static void main(String[] args) {
        String input = "aalishan";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(result);
       // System.out.println(result.charAt(result.length()-1));
    }


}
