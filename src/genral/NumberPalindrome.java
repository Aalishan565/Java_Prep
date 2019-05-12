package genral;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 123;
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
