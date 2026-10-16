import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {
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
                System.out.println("\n1. Insert New Book");
                System.out.println("2. Search Book by ID");
                System.out.println("3. Display Available Books");
                System.out.println("4. Issue Book (Change Availability)");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO Book VALUES (?, ?, ?, ?, ?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, title);
                        ps1.setString(3, author);
                        ps1.setDouble(4, price);
                        ps1.setString(5, "Available");
                        ps1.executeUpdate();
                        System.out.println("Book inserted successfully");
                        break;

                    case 2:
                        System.out.print("Enter Book ID to search: ");
                        int searchId = sc.nextInt();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM Book WHERE BookID = ?");
                        ps2.setInt(1, searchId);
                        ResultSet rs2 = ps2.executeQuery();

                        if (rs2.next()) {
                            System.out.println("Book ID      : " + rs2.getInt("BookID"));
                            System.out.println("Title        : " + rs2.getString("Title"));
                            System.out.println("Author       : " + rs2.getString("Author"));
                            System.out.println("Price        : " + rs2.getDouble("Price"));
                            System.out.println("Availability : " + rs2.getString("Availability"));
                        } else {
                            System.out.println("Book not found");
                        }
                        break;

                    case 3:
                        Statement st = con.createStatement();
                        ResultSet rs3 = st.executeQuery(
                                "SELECT * FROM Book WHERE Availability = 'Available'");

                        System.out.println("ID\tTitle\t\t\tAuthor\t\t\tPrice");
                        boolean found = false;
                        while (rs3.next()) {
                            found = true;
                            System.out.println(rs3.getInt("BookID") + "\t"
                                    + rs3.getString("Title") + "\t\t"
                                    + rs3.getString("Author") + "\t\t"
                                    + rs3.getDouble("Price"));
                        }
                        if (!found) {
                            System.out.println("No books available");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();

                        PreparedStatement ps4 = con.prepareStatement(
                                "UPDATE Book SET Availability = 'Issued' WHERE BookID = ?");
                        ps4.setInt(1, issueId);
                        int rows = ps4.executeUpdate();

                        if (rows > 0) {
                            System.out.println("Book issued, availability updated");
                        } else {
                            System.out.println("Book not found");
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
