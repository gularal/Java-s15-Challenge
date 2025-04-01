package Model;

import java.util.List;

public class Reader extends Person {
    List<Book> books;

    public Reader(String name, List<Book> books) {
        super(name);
        this.books = books;
    }

    public void borrowBook(String bookID) {
        books.stream()
                .filter(book -> book.getBookId().equals(bookID))
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.CHECKED_OUT);
        });
    }

    public void returnBook(String bookID) {
        books.stream()
                .filter(book -> book.getBookId().equals(bookID))
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.AVAILABLE);
        });
    }

    public void showBook(String bookID) {
        books.stream()
                .filter(book -> book.getBookId().equals(bookID))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void purchaseBook(String bookID) {
        books.stream()
                .filter(book -> book.getBookId().equals(bookID))
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.SOLD);});
    }
}
