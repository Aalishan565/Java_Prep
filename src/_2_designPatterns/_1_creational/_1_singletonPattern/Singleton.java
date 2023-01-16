package _2_designPatterns._1_creational._1_singletonPattern;

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("new object created of Singleton()");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
