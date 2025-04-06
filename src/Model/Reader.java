package Model;

import java.util.List;

public class Reader extends Person {
    List<Book> books;

    public Reader(String name, List<Book> books) {
        super(name);
        this.books = books;
    }

    public void borrowBook(int bookID) {
        books.stream()
                .filter(book -> book.getBookID() == bookID)
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.CHECKED_OUT);
        });
    }

    public void returnBook(int bookID) {
        books.stream()
                .filter(book -> book.getBookID() == bookID)
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.AVAILABLE);
        });
    }

    public void showBook(int bookID) {
        books.stream()
                .filter(book -> book.getBookID() == bookID)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void purchaseBook(int bookID) {
        books.stream()
                .filter(book -> book.getBookID() == bookID)
                .findFirst()
                .ifPresent(book -> {book.setStatus(BookStatus.SOLD);});
    }

    @Override
    public void whoYouAre() {
        System.out.println(this.getName());
    }
}
