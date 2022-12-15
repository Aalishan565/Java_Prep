package _1_genral;

public class _6_Fibonacci {
    static int first = 0;
    static int second = 1;
    static int nextNumber;

    public static void main(String[] args) {
        int number = 10;
       //System.out.println(first);
        //System.out.println(second);
       // fibonacciUsingRecursionIfCondition(number - 2);
       // System.out.println(fibonacciUsingRecursion(9));
        fibonacciUsingForLoop(number);
    }

    private static void fibonacciUsingRecursionIfCondition(int number) {
        if (number > 0) {
            nextNumber = first + second;
            System.out.println(nextNumber);
            first = second;
            second = nextNumber;
            fibonacciUsingRecursionIfCondition(number - 1);
        }
    }

    private static int fibonacciUsingRecursion(int number) {
        if (number <= 1)
            return number;
        return fibonacciUsingRecursion(number - 1) + fibonacciUsingRecursion(number - 2);
    }

    private static void fibonacciUsingForLoop(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        for (int i = 0; i < number; i++) {
            nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

}
