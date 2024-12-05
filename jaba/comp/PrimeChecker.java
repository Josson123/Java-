package comp;

public class PrimeChecker {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean areDigitsPrime(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (!isPrime(digit)) return false;
            num /= 10;
        }
        return true;
    }
}
