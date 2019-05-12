package genral;

public class AlphabetTest {
    public static void main(String[] args) {
        char ch = '@';
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Given char is alphabet");
        } else {
            System.out.println("Given char is not alphabet");
        }
    }
}
