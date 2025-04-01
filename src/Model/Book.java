package Model;

import java.time.LocalDateTime;

public class Book {
    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    private String bookId;
    private String title;
    private Author author;
    private String name;
    private int price;
    private BookStatus status;
    private String edition;
    private LocalDateTime dateOfPurchase;

    public Book(String bookId, String title, Author author, LocalDateTime dateOfPurchase) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
    public void changeOwner(String newOwner){
        System.out.println("Kitabın sahibi " +title + " olarak değiştirildi. " +newOwner );
    }
    public void updateStatus(BookStatus newStatus) {
        this.status = newStatus;
    }
    public void display(){
        System.out.println("Book: " + title + " ,Yazar: " + author.name + "Status: " +status);
    }
}