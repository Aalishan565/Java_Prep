package genral;

public class Fibonacci {
    static int first = 0;
    static int second = 1;
    static int nextNumber;

    public static void main(String[] args) {
        int number = 7;
        System.out.println(first);
        System.out.println(second);
         fibonacciUsingForLoop(number);
       // fibonacciUsingRecurssion(number - 2);
    }

    private static void fibonacciUsingRecurssion(int number) {
        if (number > 0) {
            nextNumber = first + second;
            System.out.println(nextNumber);
            first = second;
            second = nextNumber;
            fibonacciUsingRecurssion(number - 1);
        }
    }

    private static void fibonacciUsingForLoop(int number) {

        for (int i = 2; i < number; i++) {
            nextNumber = first + second;
            System.out.println(nextNumber);
            first = second;
            second = nextNumber;
        }
    }
}
