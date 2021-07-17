package ca.bcit.winter2021.comp2522.midterm.question7;
import java.util.ArrayList;

public class Shelf {
    private ArrayList<Book>books;

    public Shelf() {
        this.books=new ArrayList<>();
    }

    public Shelf(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book b){
        books.add(b);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
