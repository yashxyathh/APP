import java.sql.*;
import java.util.Scanner;

public class ProductStore {
    static final String URL = "jdbc:mysql://localhost:3306/tutorial9";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected to database");

            int choice;
            do {
                System.out.println("\n1. Insert New Product");
                System.out.println("2. Retrieve Product by ID");
                System.out.println("3. Update Product Quantity");
                System.out.println("4. Display Products with Quantity below 10");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO Product VALUES (?, ?, ?, ?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setDouble(3, price);
                        ps1.setInt(4, qty);
                        ps1.executeUpdate();
                        System.out.println("Product inserted successfully");
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int searchId = sc.nextInt();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM Product WHERE ProductID = ?");
                        ps2.setInt(1, searchId);
                        ResultSet rs2 = ps2.executeQuery();

                        if (rs2.next()) {
                            System.out.println("Product ID   : " + rs2.getInt("ProductID"));
                            System.out.println("Product Name : " + rs2.getString("ProductName"));
                            System.out.println("Price        : " + rs2.getDouble("Price"));
                            System.out.println("Quantity     : " + rs2.getInt("Quantity"));
                        } else {
                            System.out.println("Product not found");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Product ID: ");
                        int updateId = sc.nextInt();
                        System.out.print("Enter New Quantity: ");
                        int newQty = sc.nextInt();

                        PreparedStatement ps3 = con.prepareStatement(
                                "UPDATE Product SET Quantity = ? WHERE ProductID = ?");
                        ps3.setInt(1, newQty);
                        ps3.setInt(2, updateId);
                        int rows = ps3.executeUpdate();

                        if (rows > 0) {
                            System.out.println("Quantity updated successfully");
                        } else {
                            System.out.println("Product not found");
                        }
                        break;

                    case 4:
                        PreparedStatement ps4 = con.prepareStatement(
                                "SELECT * FROM Product WHERE Quantity < ?");
                        ps4.setInt(1, 10);
                        ResultSet rs4 = ps4.executeQuery();

                        System.out.println("ID\tName\t\tPrice\tQuantity");
                        boolean found = false;
                        while (rs4.next()) {
                            found = true;
                            System.out.println(rs4.getInt("ProductID") + "\t"
                                    + rs4.getString("ProductName") + "\t\t"
                                    + rs4.getDouble("Price") + "\t"
                                    + rs4.getInt("Quantity"));
                        }
                        if (!found) {
                            System.out.println("No products with quantity below 10");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 5);

            con.close();
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
        sc.close();
    }
}
