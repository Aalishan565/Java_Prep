package genral;

public class ReverseAlphabets {
    public static void main(String args[]) {
        String input = "ab#,oQ,a@b";
        System.out.println(saperate(input));
    }

    private static String saperate(String input) {
        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            if ((ch[start] >= 'a' && ch[start] <= 'z' || ch[start] >= 'A' && ch[start] <= 'Z')
                    && (ch[end] >= 'a' && ch[end] <= 'z' || ch[end] >= 'A' && ch[end] <= 'Z')) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            } else if ((ch[start] <= 'a' && ch[start] >= 'z' || ch[start] <= 'A' && ch[start] >= 'Z')) {
                start++;
            } else if ((ch[end] <= 'a' && ch[end] >= 'z' || ch[end] <= 'A' && ch[end] >= 'Z')) {
                end--;

            } else {
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
