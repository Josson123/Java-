public class AreaCalculator {
    // Area of rectangle (two parameters of same type)
    public static double area(double length, double width) {
        return length * width;
    }
    
    // Area of triangle (boolean to differentiate)
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        // Rectangle area
        double rectangleArea = area(5.0, 4.0);
        
        // Triangle area
        double triangleArea = area(6.0, 3.0, true);
        
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}