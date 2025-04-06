import Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Kitaplar oluşturuluyor
        Book book1 = new Book(1, "J.R.R. Tolkien", "Yüzüklerin Efendisi", 25.99, BookStatus.AVAILABLE, "1. Baskı", "2023-01-15");
        Book book2 = new Book(2, "George Orwell", "1984", 19.50, BookStatus.AVAILABLE, "3. Baskı", "2022-11-20");
        Book book3 = new Book(3, "Frank Herbert", "Dune", 22.75, BookStatus.AVAILABLE, "2. Baskı", "2023-03-10");

        // Yazarlar oluşturuluyor
        Author author1 = new Author("J.R.R. Tolkien");
        Author author2 = new Author("George Orwell");
        Author author3 = new Author("Frank Herbert");

        // Yazarlara kitaplar ekleniyor
        author1.newBook(book1);
        author2.newBook(book2);
        author3.newBook(book3);

        // Okuyucular oluşturuluyor
        Reader reader1 = new Reader("Ayşe Yılmaz", new ArrayList<Book>());
        Reader reader2 = new Reader("Mehmet Demir", new ArrayList<Book>());

        // Kütüphane oluşturuluyor
        Library library = new Library();
        library.newBook(book1);
        library.newBook(book2);
        library.newBook(book3);

        // Kütüphaneci oluşturuluyor
        Librarian librarian = new Librarian("Elif Kaya", "12345");

        // Okuyucular kitap ödünç alıyor
        library.lendBook(book1);
        reader1.borrowBook(book1.getBookID());

        library.lendBook(book2);
        reader2.borrowBook(book2.getBookID());

        // Kitap bilgileri görüntüleniyor
        book1.display();
        book2.display();

        // Okuyucuların ödünç aldığı kitaplar görüntüleniyor
        reader1.showBook(book1.getBookID());
        reader2.showBook(book2.getBookID());

        // Okuyucular kitapları iade ediyor
        library.takeBackBook(book1);
        reader1.returnBook(book1.getBookID());

        library.takeBackBook(book2);
        reader2.returnBook(book2.getBookID());

        // Kütüphaneci kitap arıyor
        librarian.searchBook("Dune");

        // Üye kaydı oluşturuluyor
        MemberRecord member1 = new MemberRecord(101, "Öğrenci", "2023-09-01", 3, "Ali Can", "İstanbul", "555-123-4567");

        // Öğrenci ve Fakülte örnekleri oluşturuluyor
        Student student1 = new Student(102, "Öğrenci", "2023-09-05", 2, "Zeynep Öz", "Ankara", "555-987-6543");
        Faculty faculty1 = new Faculty(201, "Fakülte Üyesi", "2023-08-15", 5, "Prof. Dr. Ahmet Türk", "İzmir", "555-111-2233");

        // Üyelerin kitap ödünç alma sayıları arttırılıyor
        member1.incBookIssued();
        student1.incBookIssued();
        faculty1.incBookIssued();

        // Üyelerin bilgileri görüntüleniyor
        System.out.println("Üye Bilgileri:");
        System.out.println("Adı: " + member1.getMember().getName());
        System.out.println("Ödünç Alınan Kitap Sayısı: " + member1.getMember().getNoBooksIssued());

        System.out.println("\nÖğrenci Bilgileri:");
        System.out.println("Adı: " + student1.getMember().getName());
        System.out.println("Ödünç Alınan Kitap Sayısı: " + student1.getMember().getNoBooksIssued());

        System.out.println("\nFakülte Üyesi Bilgileri:");
        System.out.println("Adı: " + faculty1.getMember().getName());
        System.out.println("Ödünç Alınan Kitap Sayısı: " + faculty1.getMember().getNoBooksIssued());
    }
}