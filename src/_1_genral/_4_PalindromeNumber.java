package _1_genral;

public class _4_PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int reminder = 0;
        int sum = 0;
        int temp = number;
        while (number > 0) {
            reminder = number % 10;
            sum = (sum * 10) + reminder;
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
