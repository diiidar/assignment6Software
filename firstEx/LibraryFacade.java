package assignment6Software.firstEx;

import java.util.List;

public class LibraryFacade {
    private BookInventorySystem bookSystem;
    private UserManagementSystem userSystem;

    public LibraryFacade() {
        bookSystem = new BookInventorySystem();
        userSystem = new UserManagementSystem();
    }

    public void addBook(Book book) {
        bookSystem.addBook(book);
    }

    public List<Book> searchBooks(String query) {
        return bookSystem.searchBooks(query);
    }

    public boolean borrowBook(Book book) {
        return bookSystem.borrowBook(book);
    }

    public void returnBook(Book book) {
        bookSystem.returnBook(book);
    }

    public void addUser(User user) {
        userSystem.addUser(user);
    }
}
