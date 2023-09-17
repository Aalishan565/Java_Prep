package _3_string_problems;

public class _7_FirstFromLastNonRepeatingChar {

    static int max_size = 256;

    public static void main(String[] args) {
        String word = "aaliisshan";
        // System.out.println(findFirstNonRepeatingCharFromLast(word));
        System.out.println(findKthNonRepeatingCharFromStart(word, 2));
    }

    static String findFirstNonRepeatingCharFromLast(String word) {
        String firstFromLast = "";
        int[] array = new int[max_size];
        for (int i = 0; i < word.length(); i++) {
            array[word.charAt(i)]++;
        }
        for (int i = word.length() - 1; i >= 0; i--) {
            char ca = word.charAt(i);
            if (array[ca] == 1) {
                return String.valueOf(ca);
            }
        }
        return firstFromLast;
    }

    static String findFirstNonRepeatingCharFromStart(String word) {
        String firstFromLast = "";
        int[] array = new int[max_size];
        for (int i = 0; i < word.length(); i++) {
            array[word.charAt(i)]++;
        }
        for (int i = 0; i < word.length(); i++) {
            char ca = word.charAt(i);
            if (array[ca] == 1) {
                return String.valueOf(ca);
            }
        }
        return firstFromLast;
    }

    static String findKthNonRepeatingCharFromStart(String word, int k) {
        String kthNonRepeating = "";
        int counter = 0;
        int[] array = new int[max_size];
        for (int i = 0; i < word.length(); i++) {
            array[word.charAt(i)]++;
        }
        for (int i = 0; i < word.length(); i++) {
            char ca = word.charAt(i);
            if (array[ca] == 1) {
                counter++;
                if (counter == k) {
                    return String.valueOf(ca);
                }
            }
        }
        return kthNonRepeating;
    }

}
