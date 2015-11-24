package hw.week2;

import java.util.ArrayList;

public class Book {

    private int isdn;
    private String author;
    private String name;
    private int yearPublic;



    public Book(int isdn, String author, String name, int yearPublic) {
        this.isdn = isdn;
        this.author = author;
        this.name = name;
        this.yearPublic = yearPublic;
    }




    public String toString() {
        return "" + name + ", author: " + author + ", year: " + yearPublic;
    }

    public static ArrayList<Book> findNewBooks(ArrayList<Book> books, int yearPublic) {
        
        ArrayList<Book> newBooks = new ArrayList<>();
        
        for (Book b : books) {
            if (b.yearPublic >= yearPublic) {
                newBooks.add(b);
            }
        }
        
        return newBooks;
    }

    public boolean equalsAuthor (String author) {
        return author.equals(this.author);
    }


    public static ArrayList<Book> findBooksByAuthor(ArrayList<Book> books, String author) {

        ArrayList<Book> newBooks = new ArrayList<>();

        for (Book b : books) {
            if (b.equalsAuthor(author)) {
                newBooks.add(b);
            }
        }

        return newBooks;
    }

}
