package calculator;

public class Arithmetic {
    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return first / second;
    }
}
