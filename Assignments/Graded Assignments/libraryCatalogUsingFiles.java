import java.io.*;
import java.util.*;

public class libraryCatalogUsingFiles {

    private static final int MAX_BOOKS = 10;

    private Book[] books;

    public libraryCatalogUsingFiles() {
        books = new Book[MAX_BOOKS];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(int bookId, String studentId) {
        Book book = getBookById(bookId);
        if (book != null) {
            book.setAvailabilityStatus(studentId);
            book.setIssueDate(new Date());
        }
    }

    public void returnBook(int bookId) {
        Book book = getBookById(bookId);
        if (book != null) {
            Date currentDate = new Date();
            int daysDelayed = (int) (currentDate.getTime() - book.getIssueDate().getTime()) / (1000 * 60 * 60 * 24);
            int charges = daysDelayed * 10;

            book.setAvailabilityStatus("available");
            book.setIssueDate(null);

            System.out.println("Delayed by " + daysDelayed + " days. Delayed charges: Rs. " + charges);
        }
    }

    private Book getBookById(int bookId) {
        for (Book book : books) {
            if (book != null && book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    public void saveDataToCSV(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Book book : books) {
            if (book != null) {
                bufferedWriter.write(book.getBookId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getAvailabilityStatus() + "," + book.getIssueDate() + "\n");
            }
        }

        bufferedWriter.close();
    }

    public void loadDataFromCSV(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] bookData = line.split(",");
            Book book = new Book(Integer.parseInt(bookData[0]), bookData[1], bookData[2], bookData[3], bookData[4]);
            addBook(book);
        }

        bufferedReader.close();
    }

    public static void main(String[] args) {
        libraryCatalogUsingFiles libraryCatalog = new libraryCatalogUsingFiles();

        libraryCatalog.addBook(new Book(101, "HTML and CSS", "Jon Duckett", "available", null));
        libraryCatalog.addBook(new Book(102, "JavaScript: The Good Parts", "Douglas Crockford", "available", null));
        libraryCatalog.addBook(new Book(103, "Learning Web Design", "Jennifer Niederst Robbins", "CP2014", new Date()));
        libraryCatalog.addBook(new Book(104, "Responsive Web Design", "Ben Frain", "EC3142", new Date()));

        try {
            libraryCatalog.saveDataToCSV("libraryA.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            libraryCatalog.loadDataFromCSV("libraryA.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}    