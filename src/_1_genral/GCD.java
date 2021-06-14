package _1_genral;

public class GCD {
    public static void main(String[] args) {
        int a = 500;
        int b = 400;
        System.out.println(findGCD(a, b));
    }

    private static int findGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return findGCD(a % b, b);
        } else {
            return findGCD(a, b % a);
        }
    }
}
