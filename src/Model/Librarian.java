package Model;

public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void searchBook(String title) {
        System.out.println("Searching for book " + title);
    }

    public boolean verifyMember(int memberID) {
        return true; // Geçici olarak true döndürülüyor
    }

    public void issueBook(Book book, Reader reader) {
        System.out.println("Book Issued");
    }

    public double calculateFine(Book book, Reader reader) {
        return 0.0;
    }

    public void createBill(Reader reader) {
        System.out.println("Bill created");
    }

    public void returnBook(Book book, Reader reader) {
        System.out.println("Book Returned");
    }
}