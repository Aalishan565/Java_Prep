package genral;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        //factorialUsingLoop(number);
        System.out.println(factorialUsingRecurssion(number));
    }

    private static int factorialUsingRecurssion(int fact) {
        if (fact == 0) {
            return 1;
        } else {
            fact = fact * factorialUsingRecurssion(fact - 1);

        }
        return fact;
    }

    private static void factorialUsingLoop(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
