package string_problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCharCount {
    public static void main(String[] args) {
        String s= "aalishan";
        Map<Character,Integer> map= new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            Character c=s.charAt(i);
            if (map.containsKey(c)){
                int count=map.get(c);
                map.put(c,++count);
            }else {
                map.put(c,1);
            }
        }
       // System.out.println(map.entrySet());
        map.forEach((X,Y)-> System.out.println(X+" "+Y));
    }
}
