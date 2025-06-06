// Calculator.java
public class Calculator {
    // Adds two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a
    public static int sub(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("add: " + add(x, y));   // 15
        System.out.println("sub: " + sub(x, y));   // 5
        System.out.println("mul: " + mul(x, y));   // 50
        System.out.println("div: " + div(x, y));   // 2
    }
}
