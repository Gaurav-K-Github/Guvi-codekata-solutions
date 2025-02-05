import java.util.ArrayList;
import java.util.Scanner;

class Book {
   //..... YOUR CODE STARTS HERE .....
   
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor to initialize the book's title, author, and borrowed status
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getter for the book's title
    public String getTitle() {
        return title;
    }

    // Method to check if the book is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Method to borrow the book (mark as borrowed)
    public void borrowBook() {
        this.isBorrowed = true;
    }

    // Method to return the book (mark as not borrowed)
    public void returnBook() {
        this.isBorrowed = false;
    }
   
   
   //..... YOUR CODE ENDS HERE .....
}

class Library {
   //..... YOUR CODE STARTS HERE .....
   
    private ArrayList<Book> books;

    // Constructor to initialize the library's book list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added");
    }

    // Method to borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("Book borrowed");
                } else {
                    System.out.println("Book not available");
                }
                return;
            }
        }
        System.out.println("Book not available");
    }

    // Method to return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned");
                } else {
                    System.out.println("Book not borrowed");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
  
   
   //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
   
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Input the number of operations
       
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each operation
        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine();
            String[] parts = operation.split(" ", 3);

            switch (parts[0].toLowerCase()) {
                case "add":
                    // Add a book to the library
                    String title = parts[1];
                    String author = parts[2];
                    library.addBook(title, author);
                    break;
                case "borrow":
                    // Borrow a book from the library
                    library.borrowBook(parts[1]);
                    break;
                case "return":
                    // Return a book to the library
                    library.returnBook(parts[1]);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }

        scanner.close();
    
   
        //..... YOUR CODE ENDS HERE .....
    }
}
