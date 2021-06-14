package _3_string_problems;

public class PermutationCombination {
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        PermutationCombination permutation = new PermutationCombination();
        permutation.permute(str, 0, n - 1);
    }
    private void permute(String str, int start, int end)
    {
        if (start == end)
            System.out.println(str);
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }
    public String swap(String a, int index1, int index2)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
        return String.valueOf(charArray);
    }
}
