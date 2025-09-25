import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Book methods
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // User methods
    public void addUser(User user) {
        users.add(user);
        System.out.println("✅ User added successfully!");
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found!");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    // Issue book
    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("❌ Book not found!");
        } else if (user == null) {
            System.out.println("❌ User not found!");
        } else if (book.isIssued()) {
            System.out.println("❌ Book already issued!");
        } else {
            book.issueBook();
            user.issueBook(book);
            System.out.println("✅ Book issued to " + user.getName());
        }
    }

    // Return book
    public void returnBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("❌ Book not found!");
        } else if (user == null) {
            System.out.println("❌ User not found!");
        } else if (!book.isIssued()) {
            System.out.println("❌ This book is not issued!");
        } else {
            book.returnBook();
            user.returnBook(book);
            System.out.println("✅ Book returned by " + user.getName());
        }
    }

    // Helper methods
    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                return b;
            }
        }
        return null;
    }

    private User findUser(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) {
                return u;
            }
        }
        return null;
    }
}
