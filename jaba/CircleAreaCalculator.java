interface Shape {
    double PI = 3.14;
    double calculateArea();
}

class Circle implements Shape {
    private double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
}

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}