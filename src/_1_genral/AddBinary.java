package _1_genral;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("101", "110"));
    }

    private static String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        int carry = 0;
        String result = "";
        int counter = 0;
        while (counter < l1 || counter < l2 || carry != 0) {
            int x = 0;
            if (counter < l1 && a.charAt(l1 - 1 - counter) == '1') x = 1;
            int y = 0;
            if (counter < l2 && b.charAt(l2 - 1 - counter) == '1') y = 1;
            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            counter++;
        }
        return result;
    }

}
