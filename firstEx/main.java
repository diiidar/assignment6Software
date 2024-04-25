package assignment6Software.firstEx;

import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        LibraryFacade facade = new LibraryFacade();

        addBooks(facade);

        facade.addUser(new User("Alice"));
        facade.addUser(new User("Bob"));


        String[] searchBook = new String[]{"The Secret Garden", "Harry Potter"};
        for(int i = 0; i < searchBook.length; i++){
            List<Book> searchResults = facade.searchBooks(searchBook[i]);
            System.out.println("//Search results by book name '" + searchBook[i] + "':");
            printMsgWithProgressBar("Searching...", 25, 60);

            if(searchResults.isEmpty()){
                System.out.println("There is no such book with that characteristics...");
                System.exit(0);
            }
            for (Book book : searchResults) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Availability: " + book.isAvailable());
            }
            Book book1 = searchResults.get(0);
            boolean success = facade.borrowBook(book1);
            System.out.println("-----------------------------------------------");
            System.out.println("//Borrowing book " + book1.getTitle());
            printMsgWithProgressBar("Borrowing...", 25, 40);
            if (success) {
                System.out.println("Successfully borrowed " + book1.getTitle() + " by " + book1.getAuthor() + ", Availability: " + book1.isAvailable());
            } else {
                System.out.println("Failed to borrow " + book1.getTitle() + ". Book not available.");
            }
            System.out.println("-----------------------------------------------");
            facade.returnBook(book1);
            System.out.println("Returning " + book1.getTitle() + " by " + book1.getAuthor() + ", Availability: " + book1.isAvailable());

            System.out.println("//Try to borrow book that library doesn't has");
        }
    }
    public static void addBooks(LibraryFacade facade){
        facade.addBook(new Book("The Night Circus", "Erin Morgenstern"));
        facade.addBook(new Book("The Secret Garden", "Frances Hodgson Burnett"));
        facade.addBook(new Book("Beloved", "Toni Morrison"));
        facade.addBook(new Book("1984", "George Orwell"));
        facade.addBook(new Book("The Secret Garden", "Tana French"));
        facade.addBook(new Book("Animal Farm", "George Orwell"));
        facade.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
        facade.addBook(new Book("Alchemist", "Paulo Coelho"));
        facade.addBook(new Book("Қызыл Жебе", "Шерхан Мұртаза"));
    }

    public static void printMsgWithProgressBar(String message, int length, long timeInterval)
    {
        char incomplete = '░';
        char complete = '█';
        StringBuilder builder = new StringBuilder();
        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
        System.out.println(message);
        for(int i = 0; i < length; i++)
        {
            builder.replace(i,i+1,String.valueOf(complete));
            String progressBar = "\r"+builder;
            System.out.print(progressBar);
            try{Thread.sleep(timeInterval);}
            catch (InterruptedException ignored){}
        }
        try{Thread.sleep(timeInterval);}
        catch (InterruptedException ignored){}
        System.out.println();
    }
}
