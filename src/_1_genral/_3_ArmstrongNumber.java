package _1_genral;

public class _3_ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int sum = 0;
        int reminder;
        while (number > 0) {
            reminder = number % 10;
            sum = sum + (reminder * reminder * reminder);
            number = number / 10;
        }
        if (sum == temp) {
            System.out.println(sum + " Number is armstrong");
        } else {
            System.out.println(sum + " Number is not armstrong");
        }
    }

}
