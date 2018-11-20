import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Book book1;
    private Borrower borrower;
    private Library library;

    @Before
    public void before(){
        book = new Book("True Grit", "Charles Portis", "western");
        book1 = new Book("News of the World", "Paulette Jiles", "western");
        borrower = new Borrower("Caroline", "Graves");
        library = new Library(5);
        library.addBook(book);
        library.addBook(book1);

    }

//    borrower has a borrowed book array list
    @Test
    public void borrowerHasABookList(){
        assertEquals(0, borrower.bookCount());
    }
//    borrower has a first name
    @Test
    public void borrowerHasAFirstName(){
        assertEquals("Caroline", borrower.getFirstName());
    }

    //    borrower has a last name
    @Test
    public void borrowerHasALastName(){
        assertEquals("Graves", borrower.getLastName());
    }
//
////    borrower has a first and last name.
//    @Test
//    public void borrowerHasAName(){
//        assertEquals("Caroline Graves", borrower.borrowerName());
//    }

    @Test
    public void borrowerCanAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void borrowerCanFindBookAtLibrary(){
        borrower.borrowBook(library, "True Grit");
        assertEquals(1, borrower.bookCount());
        assertEquals(1, library.bookCount());
    }

}
