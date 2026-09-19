import java.util.Scanner;

class areacalculator {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }
    
    void area(int length, int width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        areacalculator obj = new areacalculator();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        obj.area(side);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();
        obj.area(length, width);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        obj.area(radius);

        sc.close();
    }
}