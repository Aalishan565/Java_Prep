package genral;

public class PrimeNumber {
    public static void main(String[] args) {
        int limit = 100;
        for (int i = 1; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }
    }
}
