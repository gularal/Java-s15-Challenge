package Model;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> books;

    public Author(String name) {
        super(name);
        this.books = new ArrayList<Book>();// Örnek olarak 10 kitap kapasitesi
    }

    public void newBook(Book book) {
        this.books.add(book);
    }

    public void showBook(Book book) {
        book.display();
    }

    @Override
    public void whoYouAre() {
        System.out.println("Ben " + this.getName());
    }
}