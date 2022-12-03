package _1_genral;

public class _9_EvenOddNumbersUsingTwoThreads {

    static int number = 20;
    static int counter = 1;
    private static Thread oddThread;
    private static Thread evenThread;

    public static void main(String[] args) {
        _9_EvenOddNumbersUsingTwoThreads eod = new _9_EvenOddNumbersUsingTwoThreads();
        oddThread = new Thread(() -> eod.printOdd());
        evenThread = new Thread(() -> eod.printEven());

        oddThread.setName("Odd Thread");
        evenThread.setName("Even Thread");

        oddThread.start();
        evenThread.start();
    }

    public void printOdd() {
        synchronized (this) {
            while (counter <= number) {
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
            while (counter <= number) {
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
