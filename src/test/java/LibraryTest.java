import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

//Library has an array of books
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Library library;

    @Before
    public void before(){
        book1 = new Book("The Tango Singer", "Tomas Eloy Martinez", "fiction");
        book2 = new Book("Romeo & Juliet", "David Hewson", "fiction");
        book3 = new Book("If I Ever Get Out of this World Alive", "Steve Earle", "noir fiction");
        book4 = new Book("Carsick", "John Waters", "non-fiction");
        library = new Library(3);
    }

    //Write a method to count the number of books in the library.

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

//Write a method to add a book to the library stock.

    @Test
    public void booksCanBeAddedToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

//Add a capacity to the library and write a method to check if stock is full before adding a book.

    @Test
    public void libraryHasACapacity(){
        assertEquals(3, library.getCapacity());
    }

//    library won't go over capacity
    @Test
    public void libraryWontOverFlow(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void libraryCanFindSpecificBook(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(book3, library.findBook("If I Ever Get Out of this World Alive"));
    }

    @Test
    public void libraryReturnsFoundBookIndex(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(1, library.findBookIndex("If I Ever Get Out of this World Alive"));
    }

    @Test
    public void libraryRemovesBookbyIndex(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.lendBook(1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void libraryIsFull(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        assertEquals(true, library.isFull());
    }

}
