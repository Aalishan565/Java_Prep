package _1_genral;

public class _3_ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(-223));
    }

    public static int reverseInteger(int number) {
        long reminder;
        long sum = 0;
        while (number != 0) {
            reminder = number % 10;
            sum = (sum * 10) + reminder;
            number = number / 10;
        }
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) sum;
        }
    }

}
