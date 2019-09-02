package genral;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int sum = 0;
        int reminder = 0;
        while (number > 0) {
            reminder = number % 10;
            sum = sum + (reminder * reminder * reminder);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println("number is armstrong " + sum);
        } else {
            System.out.println("Number is not armstrong " + sum);
        }
    }
}
