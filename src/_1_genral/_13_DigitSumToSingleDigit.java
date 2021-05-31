package _1_genral;

public class _13_DigitSumToSingleDigit {
    public static void main(String[] args) {
        System.out.println(digSum(1239));
        int result = digSum(1239);
        while (result > 9) {
            result = digSum(result);
        }
        System.out.println(result);

    }

    static int digSum(int number) {
        int reminder;
        int sum = 0;
        while (number > 0) {
            reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }
        return sum;
    }
}
