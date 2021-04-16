package genral;

public class _8_FizzBuzz {
    public static void main(String[] args) {
        int c3 = 0;
        int c5 = 0;
        for (int i = 1; i <= 100; i++) {
            c3++;
            c5++;
            String d = "";

            if (c3 == 3) {
                d += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                d += "buzz";
                c5 = 0;
            }
            if (d.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(d);
            }
        }
    }
}
