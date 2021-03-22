package genral;

public class EvenOddUsingThread {

    static int number = 10;
    static int counter = 1;

    public static void main(String[] args) {
        EvenOddUsingThread eod = new EvenOddUsingThread();
        Thread t1 = new Thread(() -> eod.printOdd());
        Thread t2 = new Thread(() -> eod.printEven());
        t1.start();
        t2.start();
    }

    public void printOdd() {
        synchronized (this) {
            while (counter < number) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                // Print the number
                System.out.print(counter + " ");

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
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {

                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }


}