import java.util.Scanner;

interface Library {
    void issueBook(String memberName, String bookName);

    void returnBook(String memberName, String bookName);
}

class LibraryMember implements Library {
    @Override
    public void issueBook(String memberName, String bookName) {
        System.out.println(memberName + " issued the book \"" + bookName + "\".");
    }

    @Override
    public void returnBook(String memberName, String bookName) {
        System.out.println(memberName + " returned the book \"" + bookName + "\".");
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter member name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        Library libraryMember = new LibraryMember();
        libraryMember.issueBook(memberName, bookName);
        libraryMember.returnBook(memberName, bookName);
    }
}
