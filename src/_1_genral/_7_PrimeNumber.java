package _1_genral;

public class _7_PrimeNumber {
    public static void main(String[] args) {
        int limit = 19;
        allPrimeNumbers(limit);
        // System.out.println(isPrimeNumber(3));
    }

    private static void allPrimeNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
