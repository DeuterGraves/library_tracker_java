import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
//    arrange
    Book book;

    @Before
    public void before(){
        book = new Book("The Tango Singer", "Tomas Eloy Martinez", "fiction");
    }

//Books should have title
    @Test
    public void bookHasATitle(){
        assertEquals("The Tango Singer", book.getTitle());
    }

//Books should have author
    @Test
    public void bookHasAnAuthor(){
        assertEquals("Tomas Eloy Martinez", book.getAuthor());
    }

//Books should have genre
    @Test
    public void bookHasAGenre(){
        assertEquals("fiction", book.getGenre());
    }


}
