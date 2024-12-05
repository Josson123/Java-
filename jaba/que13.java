import comp.PrimeChecker;

public class que13 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (PrimeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
            if (PrimeChecker.areDigitsPrime(number)) {
                System.out.println("All digits are also prime.");
            } else {
                System.out.println("Not all digits are prime.");
            }
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
