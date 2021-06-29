package _1_genral;

public class _6_Fibonacci {
    static int first = 0;
    static int second = 1;
    static int nextNumber;

    public static void main(String[] args) {
        int number = 5;
        System.out.println(first);
        System.out.println(second);
        fibonacciUsingRecursion(number - 2);
        //fibonacciUsingForLoop(number);
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

    private static void fibonacciUsingForLoop(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 1; i <= number; i++) {
            nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

}
