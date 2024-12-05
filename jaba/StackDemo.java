interface Stack {
    void push(int item);
    int pop();
    boolean isEmpty();
}

class StackImpl implements Stack {
    private int[] stack = new int[10];
    private int top = -1;

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
    }
}
