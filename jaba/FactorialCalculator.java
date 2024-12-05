class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialCalculator {
    public static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Factorial is not defined for negative numbers");
        }
        
        if (n == 0 || n == 1) return 1;
        
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of -3: " + factorial(-3));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}