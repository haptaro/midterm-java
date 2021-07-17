package ca.bcit.winter2021.comp2522.midterm.question7;

public class Book implements Comparable<Book> {
    private String title;
    private int page;

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    @Override
    public int compareTo(Book anotherBook) {
        if(this.getPage()==anotherBook.getPage()){
            return 0;
        }else if(this.getPage()< anotherBook.getPage()){
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                '}';
    }
}
