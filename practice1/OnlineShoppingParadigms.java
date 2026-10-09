class Product {
    private final int productId;
    private final String name;
    private final double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void displayProduct() {
        System.out.printf("%d - %s: %.2f%n", productId, name, price);
    }
}

public class OnlineShoppingParadigms {
    // Object-oriented programming: data and behavior are grouped in Product.
    private static double calculateDiscountedPrice(Product product, double discountPercent) {
        return product.getPrice() - (product.getPrice() * discountPercent / 100);
    }

    // Procedural programming: an operation is performed by a standalone method.
    private static double calculateTotal(double firstPrice, double secondPrice) {
        return firstPrice + secondPrice;
    }

    public static void main(String[] args) {
        Product firstProduct = new Product(301, "Keyboard", 1500.00);
        Product secondProduct = new Product(302, "Mouse", 700.00);

        System.out.println("Products (Object-Oriented Programming):");
        firstProduct.displayProduct();
        secondProduct.displayProduct();

        double discountedKeyboardPrice = calculateDiscountedPrice(firstProduct, 10);
        double total = calculateTotal(discountedKeyboardPrice, secondProduct.getPrice());

        System.out.printf("%nKeyboard price after 10%% discount: %.2f%n", discountedKeyboardPrice);
        System.out.printf("Cart total (Procedural Programming): %.2f%n", total);
    }
}
