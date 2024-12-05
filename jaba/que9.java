import comp.Factorial;

public class que9 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <number>");
            return;
        }
        int number = Integer.parseInt(args[0]);

        Factorial factorial = new Factorial();
        System.out.println("Factorial of " + number + " is: " + factorial.compute(number));
    }
}
