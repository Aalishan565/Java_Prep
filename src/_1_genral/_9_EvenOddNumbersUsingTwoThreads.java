package _1_genral;

public class _9_EvenOddNumbersUsingTwoThreads {

    static int number = 100;
    static int counter = 1;

    public static void main(String[] args) {
        _9_EvenOddNumbersUsingTwoThreads eod = new _9_EvenOddNumbersUsingTwoThreads();
        Thread t1 = new Thread(() -> eod.printOdd());
        Thread t2 = new Thread(() -> eod.printEven());
        t1.setName("Odd Thread");
        t2.setName("Even Thread");
        t1.start();
        t2.start();
    }

    public void printOdd() {
        synchronized (this) {
            while (counter < number) {
                if (counter % 2 == 0) {
                    try {
                        System.out.println(" Thread wait(): " + Thread.currentThread().getName());
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                // Print the number
                System.out.println(counter + " Thread Name: " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (counter < number) {
                if (counter % 2 == 1) {
                    try {
                        System.out.println(" Thread wait(): " + Thread.currentThread().getName());
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                // Print the number
                System.out.println(counter + " Thread Name: " + Thread.currentThread().getName());
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

}
