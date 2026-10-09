lass Book {
    protected final int bookId;
    protected final String title;
    protected final String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private final double fileSize;

    EBook(int bookId, String title, String author, double fileSize) {
        super(bookId, title, author);
        this.fileSize = fileSize;
    }

    @Override
    void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibraryInheritanceDemo {
    public static void main(String[] args) {
        EBook ebook = new EBook(201, "Effective Java", "Joshua Bloch", 2.75);
        ebook.displayBookDetails();
    }
}
