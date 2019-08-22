package genral;

public class StepsCounter {
    public static void main(String[] args) {
        int n = 8;
        int steps = d(n);
        System.out.println(steps);

    }

    private static int d(int n) {
        if (n <= 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return d(n - 1) + d(n - 2);
        }
    }
}
