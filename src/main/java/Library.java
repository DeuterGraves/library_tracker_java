import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }


    public int bookCount() {
        return collection.size();
    }

    public void addBook(Book book){
////        this can be made it's own function - is the library full to return a boolean.
//        if (this.bookCount() < this.capacity){
        if (!isFull()){
        collection.add(book);
        }
        return;
    }


    public Book findBook(String title) {
        for(Book book: collection){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public int findBookIndex(String title) {
        for(Book book : collection){
//            == doesn't work with strings, it may in weird cases - but technically, it doesn't consistently work with strings so use .equals() for strings.
            if (book.getTitle().equals(title)){
                return collection.indexOf(book);
            }
        }
        return -1;
    }

    public Book lendBook(int bookIndex){
        return collection.remove(bookIndex);
    }

    public boolean isFull(){
        return collection.size() >= this.capacity;
    }


}
