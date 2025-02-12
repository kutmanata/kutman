
class Book {
    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}


class PrintedBook extends Book {
    int numberOfPages;
    String publisher;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + numberOfPages);
        System.out.println("Book Type: Printed");
    }
}


class EBook extends Book {
    double fileSizeMB;
    String fileFormat;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Format: " + fileFormat);
        System.out.println("Book Type: EBook");
    }
}


public class Main {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, 218, "Scribner");
        EBook eBook = new EBook("Java Programming", "John Smith", 2020, 4.5, "PDF");

        System.out.println("Printed Book Details:");
        printedBook.printBookDetails();

        System.out.println("\nEBook Details:");
        eBook.printBookDetails();
    }
}


