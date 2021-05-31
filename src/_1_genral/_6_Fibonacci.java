package _1_genral;

public class _6_Fibonacci {
    static int first = 0;
    static int second = 1;
    static int nextNumber;

    public static void main(String[] args) {
        int number = 3;
        //System.out.println(first);
        //System.out.println(second);
        // fibonacciUsingRecursion(number - 2);
        System.out.println(fibonacciUsingForLoop(number));
    }

    private static void fibonacciUsingRecursion(int number) {
        if (number > 0) {
            nextNumber = first + second;
            System.out.println(nextNumber);
            first = second;
            second = nextNumber;
            fibonacciUsingRecursion(number - 1);
        }
    }

    private static int fibonacciUsingForLoop(int number) {
        if (number <= 1) {
            return number;
        }
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for (int i = 1; i < number; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return nextNumber;
    }
}
