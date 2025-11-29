import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        addNumbers(num1, num2);
        multiplyNumbers(num1, num2);
        subtractNumbers(num1, num2);
        divideNumbers(num1, num2);
    }

    public static int addNumbers(int a, int b) {
        System.out.println("Sum: " + (a + b));
        return a + b;
    }
    public static int multiplyNumbers(int a, int b) {
        System.out.println("Product: " + (a * b));
        return a * b;
    }
    public static int subtractNumbers(int a, int b) {
        System.out.println("Difference: " + (a - b));
        return a - b;
    }
    public static double divideNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        System.out.println("Quotient: " + (double) a / b);
        return (double) a / b;
    }
}
