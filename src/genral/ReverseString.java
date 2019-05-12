package genral;

public class ReverseString {
    public static void main(String[] args) {
        String s = "aalishan";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
