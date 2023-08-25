package _1_genral;

public class _2_ReverseAlphabets {

    public static void main(String args[]) {
        String input = "ab#,oQ,a@b";
        System.out.println(reverse(input));
    }

    private static String reverse(String input) {
        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            if (!Character.isAlphabetic(ch[start])) {
                start++;
            } else if (!Character.isAlphabetic(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

}
