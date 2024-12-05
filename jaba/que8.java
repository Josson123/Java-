import comp.Complex;

public class que8 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <real> <imaginary>");
            return;
        }
        int real = Integer.parseInt(args[0]);
        int imaginary = Integer.parseInt(args[1]);

        Complex complex = new Complex(real, imaginary);
        complex.display();
    }
}
