package _1_genral;

import java.util.HashMap;
import java.util.Map;

public class _11_RomanToInt {

    public static void main(String[] args) {
        convertRomanToInteger("DC");
    }

    private static void convertRomanToInteger(String input) {
        int result = 0;
        Map<Character, Integer> romanMap = new HashMap() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        for (int i = 0; i < input.length(); i++) {
            if (i != input.length() - 1 && romanMap.get(input.charAt(i)) < romanMap.get(input.charAt(i + 1))) {
                result += romanMap.get(input.charAt(i + 1)) - romanMap.get(input.charAt(i));
                i++;
            } else {
                result += romanMap.get(input.charAt(i));
            }
        }
        System.out.println(result);
    }

}
