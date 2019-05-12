package genral;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String s= "aabbccdd";
        String result="";
        for (int i = 0; i < s.length()-1; i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))){
                result+=String.valueOf(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
