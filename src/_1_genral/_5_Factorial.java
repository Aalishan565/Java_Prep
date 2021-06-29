package _1_genral;

public class _5_Factorial {

    public static void main(String[] args) {
        int number = 5;
        //factorialUsingLoop(number);
        System.out.println(factorialUsingRecursion(number));
    }

    private static int factorialUsingRecursion(int fact) {
        if (fact == 0) {
            return 1;
        }
        fact = fact * factorialUsingRecursion(fact - 1);
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
