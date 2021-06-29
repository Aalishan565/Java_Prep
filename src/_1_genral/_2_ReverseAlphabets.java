package _1_genral;

public class _2_ReverseAlphabets {

    public static void main(String args[]) {
        String input = "ab#,oQ,a@b";
        System.out.println(separate(input));
    }

    private static String separate(String input) {
        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            if (!Character.isAlphabetic(ch[start])) {
                start++;
            }
            if (!Character.isAlphabetic(ch[end])) {
                end--;
            }
            if (Character.isAlphabetic(ch[start]) && Character.isAlphabetic(ch[end])) {
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
