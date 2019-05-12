package genral;

public class ReverseStringSentance {
    public static void main(String[] args) {
        String s = "I love india";
        String spilt[] = s.split(" ");
        String result="";
        for (int i = spilt.length - 1; i >= 0; i--) {
            result += spilt[i] + " ";
        }
        System.out.println(result);
    }
}
