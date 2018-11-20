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

//    public String borrowerName(){
////        return firstName + lastName;
//        return String.format("%s %d", firstName, lastName);
//    }
}
