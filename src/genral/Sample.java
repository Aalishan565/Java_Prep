package genral;

abstract class A {
    public void test() {
        System.out.println("test");
    }
}

public class Sample extends A {

    public static void main(String[] args) {
       /* Sample s = new Sample();
        s.test();*/
        String s = null;
        //  System.out.println(s.length());
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }

    }

}



