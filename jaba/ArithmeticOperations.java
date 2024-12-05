public class ArithmeticOperations {
    // Method to add two integers and return float
    public static float add(int a, int b) {
        return (float)(a + b);
    }
    
    // Method to add two floats and return integer
    public static int add(float a, float b) {
        return (int)(a + b);
    }
    
    public static void main(String[] args) {
        // Integer input, float output
        float intResult = add(5, 3);
        System.out.println("Integer input result: " + intResult);
        
        // Float input, integer output
        int floatResult = add(5.5f, 3.3f);
        System.out.println("Float input result: " + floatResult);
    }
}