package Model;

class Author extends  Person {


    public Author(String name) {
        super(name);
    }
    public void newBook(){
        System.out.println(name + "yeni bir kitap yazdı.");
    }
    public void showBook(){}
    public void whoYouAre(){}
}
