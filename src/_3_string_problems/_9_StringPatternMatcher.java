package _3_string_problems;

public class _9_StringPatternMatcher {

    public static void main(String[] args) {
        String mainString = "adfaahasfashansdf";
        String subString = "sha";
        int startingPoint = 0;
        int j = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == subString.charAt(j)) {
                if (j < subString.length() - 1) {
                    j++;
                } else {
                    break;
                }
            } else {
                j = 0;
                if (i < mainString.length() - 1) {
                    startingPoint = i + 1;
                } else {
                    break;
                }
            }
        }
        if (startingPoint < mainString.length() - 1) {
            System.out.println(startingPoint);
        } else {
            System.out.println("Not found");
        }
    }

}
