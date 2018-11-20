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
        if (this.bookCount() < this.capacity){
        collection.add(book);
        }
        return;
    }



}
