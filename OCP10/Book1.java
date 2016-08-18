import java.util.*;

public class Book2{
    private static Map<String, Book> bookstore = new HashMap<>();

    private String isbn;
    private String title;
    private String author;

    public Collection<Book> findAllBooks(){
        return bookstore.values();
    }

    public Book findBookByIsbn(String isbn){
        return bookstore.get(isbn);
    }

    public void create(){
        bookstore.put(isbn,this);
    }

    public void delete(){
        bookstore.remove(isbn);
    }

    public void update(){
        //no operation here...
    }
}
