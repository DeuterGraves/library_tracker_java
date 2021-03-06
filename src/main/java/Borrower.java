import java.util.ArrayList;

public class Borrower {

    private String firstName;
    private String lastName;
    private ArrayList<Book > bookList;

    public Borrower(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public int bookCount() {
        return this.bookList.size();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void borrowBook(Library library, String title) {
//        find the book by title returns the book
        Book book = library.findBook(title);
//        add the book to the borrower
        this.addBook(book);
//        find the book by index in the library - returns the index
        int bookIndex = library.findBookIndex(title);
//        remove the book by index from the library
        library.lendBook(bookIndex);
    }


    public String borrowerName(){
        return firstName + " " + lastName;
    }


}
