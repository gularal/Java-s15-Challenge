package Model;

public class Book {
    private int bookID;
    private String author;
    private String name;
    private double price;
    private BookStatus status;
    private String edition;
    private String dateOfPurchase;


    public Book(int bookID, String author, String name, double price, BookStatus status, String edition, String dateOfPurchase) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }
    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getTitle() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }


    public void changeOwner() {
        // Sahip değiştirme mantığı burada
    }

    public String getOwner() {
        // Sahibi döndürme mantığı burada
        return ""; // Geçici olarak boş döndürülüyor
    }

    public void display() {
        System.out.println("Kitap ID: " + bookID);
        System.out.println("Yazar: " + author);
        System.out.println("Adı: " + name);
        System.out.println("Fiyat: " + price);
        System.out.println("Durum: " + status);
        System.out.println("Baskı: " + edition);
        System.out.println("Satın Alma Tarihi: " + dateOfPurchase);
    }

    public void updateStatus(BookStatus newStatus) {
        this.status = newStatus;
    }
}