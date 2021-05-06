package _3_string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class _5_StringCharCount {
    public static void main(String[] args) {
        String s = "aalishan";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        //map.forEach((X,Y)-> System.out.println(X+" "+Y));
        StringBuffer sb = new StringBuffer();
        map.forEach((X, Y) -> sb.append(X + "" + Y));

        System.out.println(sb);

    }
}
