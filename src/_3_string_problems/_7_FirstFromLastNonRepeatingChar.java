package _3_string_problems;

public class _7_FirstFromLastNonRepeatingChar {

    static int max_size = 256;

    public static void main(String[] args) {
        String word = "aaliishan";
        int[] array = new int[max_size];
        for (int i = 0; i < word.length(); i++) {
            array[word.charAt(i)]++;
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            char ca = word.charAt(i);
            if (array[ca] == 1) {
                System.out.println("First non repeating char is: " + ca);
                break;
            }
        }
    }

}
