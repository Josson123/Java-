package comp;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }
}
