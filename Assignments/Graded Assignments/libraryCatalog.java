import java.io.*;
import java.util.*;

public class libraryCatalog {

    public static final String FILENAME = "libraryA.csv";

    public static List<Book> books = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        // Load the books from the file if it exists
        if (new File(FILENAME).exists()) {
            books = loadBooksFromFile();
        }

        // Start the menu
        startMenu();
    }

    public static List<Book> loadBooksFromFile() {
        return null;
    }

    public static void startMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Unique Library");
            System.out.println("1. List all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Save books");
            System.out.println("5. Load books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listBooks();
                    break;
                case 2:
                    issueBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:                    
                    saveBooks();                                        
                    break;
                case 5:
                    loadBooks();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void loadBooks() {
    }

    public static void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void issueBook(Scanner scanner) {
        System.out.println("Enter the book ID: ");
        int bookId = scanner.nextInt();

        Book book = getBookById(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Enter the student ID: ");
            String studentId = scanner.next();

            book.setStudentId(studentId);
            book.setIssueDate(new Date());

            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    public static Book getBookById(int bookId) {
        return null;
    }

    public static void returnBook(Scanner scanner) {
        System.out.println("Enter the book ID: ");
        int bookId = scanner.nextInt();

        Book book = getBookById(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (!book.isAvailable()) {
            Date issueDate = book.getIssueDate();
            Date today = new Date();

            long differenceInDays = (today.getTime() - issueDate.getTime()) / (1000 * 60 * 60 * 24);

            if (differenceInDays > 7) {
                int delayedCharges = (int) (differenceInDays * 10);

                System.out.println("You have delayed the return of the book by " + differenceInDays + " days.");
                System.out.println("Your delayed charges are Rs. " + delayedCharges);
            }

            book.setStudentId(null);
            book.setIssueDate(null);

            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is already available");
        }
    }

    public static void saveBooks() throws IOException {
        FileWriter fileWriter = new FileWriter(FILENAME);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Book book : books) {
            bufferedWriter.write(book.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}        