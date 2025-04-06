package Model;


public class Magazines extends Book {
    public Magazines(int bookID, String author, String name, double price, BookStatus status, String edition, String dateOfPurchase) {
        super(bookID, author, name, price, status, edition, dateOfPurchase);
    }
}