class PrimeThread extends Thread {
    public void run() {
        System.out.println("Prime Numbers:");
        for (int num = 2; num < 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i < 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class PrimeEvenThreads {
    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread();
        EvenThread evenThread = new EvenThread();

        primeThread.start();
        evenThread.start();
    }
}
