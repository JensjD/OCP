import java.util.*;

public class InMemoryBookDao{
    

    private static Map<String, Book> bookstore = new HashMap<>();
    public Collection<Book> findAllBooks(){
        return bookstore.values();
    }

    public Book findBookByIsbn(Book book){
        return bookstore.get(book.getIsbn());
    }

    public void create(Book book){
        bookstore.put(book.getIsbn(),book);
    }

    public void delete(Book book){
        bookstore.remove(book.getIsbn());
    }

    public void update(Book book){
        //no operation here for in-mem storage...
    }
}
