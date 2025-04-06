package Model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<Book>(); // Örnek olarak 100 kitap kapasitesi
        this.readers = new ArrayList<Reader>(); // Örnek olarak 50 okuyucu kapasitesi
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReader() {
        return readers;
    }

    public void newBook(Book book) {
        this.books.add(book);
    }

    public void lendBook(Book book) {
        this.books.remove(book);
    }

    public void takeBackBook(Book book) {
        this.books.add(book);
    }

    public void showBook(Book book) {
        book.display();
    }
}