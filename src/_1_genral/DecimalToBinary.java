package _1_genral;

public class DecimalToBinary {

    public static void main(String[] args) {
        int number = 31;
        printBinary(number);
    }

    private static void printBinary(int number) {
        int temp = number;
        int reminder;
        String s = "";
        while (temp > 0) {
            reminder = temp % 2;
            temp = temp / 2;
            s = "" + reminder + s;
        }
        System.out.println(s);
    }

}
