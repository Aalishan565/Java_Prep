package _1_genral;

public class _9_EvenOddNumbersUsingTwoThreads {

    static int number = 20;
    static int counter = 1;
    private static Thread t1;
    private static Thread t2;

    public static void main(String[] args) {
        _9_EvenOddNumbersUsingTwoThreads eod = new _9_EvenOddNumbersUsingTwoThreads();
        t1 = new Thread(() -> eod.printOdd());
        t2 = new Thread(() -> eod.printEven());
        t1.setName("Odd Thread");
        t2.setName("Even Thread");
        t1.start();
        t2.start();
    }

    public void printOdd() {
        synchronized (this) {
            while (counter < number) {
                // Print the number
                System.out.println(counter + " " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to other thread
                notify();
                if (counter % 2 == 0) {
                    try {
                        System.out.println("wait(): " + Thread.currentThread().getName());
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (counter < number) {
                // Print the number
                System.out.println(counter + " " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to other thread
                notify();
                if (counter % 2 == 1) {
                    try {
                        System.out.println("wait(): " + Thread.currentThread().getName());
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }
            }
        }
    }

}
