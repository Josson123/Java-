class InvalidXException extends Exception {
    public InvalidXException(String message) {
        super(message);
    }
}

public class ExpressionEvaluator {
    public static double evaluateExpression(double x) throws InvalidXException {
        if (x <= 5) {
            throw new InvalidXException("x must be greater than 5");
        }
        return x / (x - 5);
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("Result for x=6: " + evaluateExpression(6));
            System.out.println("Result for x=5: " + evaluateExpression(5));
        } catch (InvalidXException e) {
            System.out.println(e.getMessage());
        }
    }
}