package _1_genral;

public class _10_SwapTwoNumbers {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("Number1 " + number1);
        System.out.println("Number2 " + number2);
    }
}
