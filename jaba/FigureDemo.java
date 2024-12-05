abstract class Figure {
    protected double length, breadth, height;
    
    public void readData(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    public void displayData() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }
    
    public abstract double area();
}

class Rectangle extends Figure {
    public double area() {
        return length * breadth;
    }
}

class Triangle extends Figure {
    public double area() {
        return 0.5 * length * breadth;
    }
}

public class FigureDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.readData(5, 4, 3);
        rect.displayData();
        System.out.println("Rectangle Area: " + rect.area());
        
        Triangle tri = new Triangle();
        tri.readData(6, 3, 2);
        tri.displayData();
        System.out.println("Triangle Area: " + tri.area());
    }
}