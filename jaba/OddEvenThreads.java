class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100); // Pause to simulate simultaneous execution
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100); // Pause to simulate simultaneous execution
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();
    }
}