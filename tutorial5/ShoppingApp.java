import java.util.Scanner;

abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Discount: Rs. " + calculateDiscount());
        System.out.println("Final Price: Rs. " + calculateFinalPrice());
    }
}

class Electronics extends Product {

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {

    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.15;
    }
}

public class ShoppingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter product name: ");
        String name = sc.next();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product product;

        if (choice == 1) {
            product = new Electronics(id, name, price);
        } else if (choice == 2) {
            product = new Clothing(id, name, price);
        } else if (choice == 3) {
            product = new Books(id, name, price);
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        product.display();

        sc.close();
    }
}