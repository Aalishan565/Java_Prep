package _3_string_problems;

public class LongestSubString {
    static final int NO_OF_CHARS = 256;

    public static void main(String[] args) {
        String str = "aalishan";
        System.out.println(longestUniqueSubString(str));
    }

    static int longestUniqueSubString(String str) {
        int n = str.length();
        int cur_len = 1;
        int max_len = 1;
        int previousIndex;
        int i;
        int visited[] = new int[NO_OF_CHARS];
        for (i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }
        visited[str.charAt(0)] = 0;
        for (i = 1; i < n; i++) {
            previousIndex = visited[str.charAt(i)];
            if (previousIndex == -1 || i - cur_len > previousIndex) {
                cur_len++;
            } else {
                if (cur_len > max_len) {
                    max_len = cur_len;
                }
                cur_len = i - previousIndex;
            }
            visited[str.charAt(i)] = i;
        }
        if (cur_len > max_len) {
            max_len = cur_len;
        }
        return max_len;
    }
}
