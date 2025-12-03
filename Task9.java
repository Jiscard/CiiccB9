import static java.lang.Math.*;
public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);  // Using Math.addExact()
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);  // Using Math.subtractExact()
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);  // Using Math.multiplyExact()
    }

    public static float divide(int a, int b) {
        // floorDiv returns an int, convert to float
        return (float) floorDiv(a, b);
    }
    public static void main(String[] args) {
        System.out.println("Addition (10 + 5): " + add(10, 5));
        System.out.println("Subtraction (10 - 5): " + subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + multiply(10, 5));
        System.out.println("Division (10 / 5): " + divide(10, 5));
    }
}
