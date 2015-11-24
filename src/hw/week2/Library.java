package hw.week2;


import java.util.ArrayList;

public class Library {

    private ArrayList<Reader> readers;
    private ArrayList<Reader> blackListReaders;
    private ArrayList<Book> books;



    public Library() {
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
    }
    
    public Library(ArrayList<Reader> readers, ArrayList<Book> books) {
        this.readers = readers;
        this.books = books;
    }


    // 1)
    public void viewAllReaders() {

        for (Reader r : getAllReaders()) {
            System.out.println(r);
        }
    }

    // 2)
    public void viewAllFreeBooks() {

        for (Book b : getFreeBooksInLibrary()) {
            System.out.println(b);
        }
    }

    // 3)
    public void addBook(Book book) {
        this.books.add(book);
    }

    // 4)
    public void addReader(Reader reader) {
        this.readers.add(reader);
    }

    // 5)
    public void giveBookToReader(Book book, Reader reader) {

        if (blackListReaders.contains(reader)) {
            System.out.println("" + reader + " is in black list!");
            return;
        }

        if (! reader.checkBooksLimit()) {
            System.out.println("Books limit!");
            return;
        }

        reader.addBook(book);
        this.books.remove(book);

    }

    // 6)
    public ArrayList<Book> getReadersBooks() {

        ArrayList<Book> readersBooks = new ArrayList<>();

        for (Reader r : this.readers) {
            for (Book b : r.getReaderBooks()) {
                readersBooks.add(b);
            }
        }
        return readersBooks;
    }

    // 7)
    public ArrayList<Book> getReaderBooks(Reader reader) {

        return reader.getReaderBooks();

    }

    // 8)
    public void addReaderToBlackList(Reader reader) {
        this.blackListReaders.add(reader);
    }

    public void removeReaderFromBlackList(Reader reader) {
        this.blackListReaders.remove(reader);
    }

    // 9)
    public ArrayList<Book> getBooksByAuthor(String author) {

        return Book.findBooksByAuthor(getAllBooks(), author);

    }

    // 10)
    public ArrayList<Book> getNewBooksByYear(int year) {

        return Book.findNewBooks(getAllBooks(), year);

    }

    public ArrayList<Book> getFreeBooksInLibrary() {
        return this.books;
    }

    public ArrayList<Book> getAllBooks() {

        ArrayList<Book> allBooks = getReadersBooks();

        for (Book b : getFreeBooksInLibrary()) {
            allBooks.add(b);
        }

        return allBooks;
    }

    public ArrayList<Reader>  getAllReaders() {
        return this.readers;
    }

}
