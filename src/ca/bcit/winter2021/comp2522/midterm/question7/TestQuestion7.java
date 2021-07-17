package ca.bcit.winter2021.comp2522.midterm.question7;

import java.util.ArrayList;
import java.util.Collections;

public class TestQuestion7 {
    public static void runAllTestScenariosForQuestion7(){

        System.out.println("test 7");

        Book b1=new Book("Travel Guid",50);
        Book b2=new Book("Times",30);
        Book b3=new Book("Text Book",100);

        ArrayList<Book>books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Shelf myShelf=new Shelf(books);

        Collections.sort(myShelf.getBooks());
        for(Book book:myShelf.getBooks()){
            System.out.println(book);
        }
    }
}
