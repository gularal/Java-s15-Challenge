package Model;

public class Journals extends Book {
    public Journals(int bookID, String author, String name, double price, BookStatus status, String edition, String dateOfPurchase) {
        super(bookID, author, name, price, status, edition, dateOfPurchase);
    }
}
