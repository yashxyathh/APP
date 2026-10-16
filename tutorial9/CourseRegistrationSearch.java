import java.sql.*;
import java.util.Scanner;

public class CourseRegistrationSearch {
    static final String URL = "jdbc:mysql://localhost:3306/tutorial9";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM CourseRegistration WHERE CourseCode = ?");
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();

            boolean found = false;
            while (rs.next()) {
                if (!found) {
                    System.out.println("\nStudents registered for " + code + ":");
                    System.out.println("ID\tName\t\tCourse Code\tCourse Name\t\tSemester");
                    found = true;
                }
                System.out.println(rs.getInt("StudentID") + "\t"
                        + rs.getString("StudentName") + "\t"
                        + rs.getString("CourseCode") + "\t\t"
                        + rs.getString("CourseName") + "\t"
                        + rs.getInt("Semester"));
            }

            if (!found) {
                System.out.println("No students are registered for course code " + code);
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
        sc.close();
    }
}
