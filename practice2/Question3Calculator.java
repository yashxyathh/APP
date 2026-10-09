import java.util.Scanner;
import calculator.Arithmetic;

public class Question3Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();

        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        try {
            double result;
            switch (operation) {
                case '+':
                    result = arithmetic.add(first, second);
                    break;
                case '-':
                    result = arithmetic.subtract(first, second);
                    break;
                case '*':
                    result = arithmetic.multiply(first, second);
                    break;
                case '/':
                    result = arithmetic.divide(first, second);
                    break;
                default:
                    throw new IllegalArgumentException(
                            "Unsupported operation: " + operation);
            }

            System.out.printf("Result: %.2f%n", result);
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}
