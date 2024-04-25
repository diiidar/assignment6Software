package assignment6Software.firstEx;

import java.util.ArrayList;
import java.util.List;

public class BookInventorySystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }


    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
    }
}
