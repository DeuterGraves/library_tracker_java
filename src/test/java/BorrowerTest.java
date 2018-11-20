import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        book = new Book("True Grit", "Charles Portis", "western");
        borrower = new Borrower("Caroline", "Graves");
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
    public void borrowerCanBorrowBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

}
