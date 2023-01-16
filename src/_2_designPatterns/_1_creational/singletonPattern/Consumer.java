package _2_designPatterns._1_creational.singletonPattern;

public class Consumer {

    private static Singleton singleton1;
    private static Singleton singleton2;
    private static Singleton singleton3;
    private static Singleton singleton4;

    public static void main(String[] args) {
        singleton1 = Singleton.getInstance();
        singleton2 = Singleton.getInstance();
        singleton3 = Singleton.getInstance();
        singleton4 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
    }
}
