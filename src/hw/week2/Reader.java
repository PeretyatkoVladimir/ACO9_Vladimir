package hw.week2;

import java.util.ArrayList;

public class Reader {

    static final int MAX_BOOK = 3;

    private String name;
    private ArrayList<Book> books;



    public Reader(String name) {
        this.name = name;
        books = new ArrayList<>();
    }



    public String toString() {
        return name;
    }



    public void addBook(Book book) {

        this.books.add(book);

    }

    public boolean checkBooksLimit() {

        return this.books.size() < MAX_BOOK;

    }
    
    public void removeBook(Book book) {
        this.books.remove(book);
    }
    
    public ArrayList<Book> getReaderBooks() {
        return this.books;
    }

}
