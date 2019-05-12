package genral;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        Map<Character,Integer>hm= new HashMap();
        String s="aalishan";
        for (int i = 0; i <s.length()-1 ; i++) {
            if (hm.containsKey(s.charAt(i))){
                int count=hm.get(s.charAt(i));
                hm.put(s.charAt(i),++count);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm.entrySet());
    }
}
