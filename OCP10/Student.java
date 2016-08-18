public class Student{
    public static void main(String[] args){
        InMemoryBookDao dao = new InMemoryBookDao();
        Book book = new Book();
        book.setIsbn("1234");
        book.setTitle("MuchWow");
        book.setAuthor("Doge");

        dao.create(book);
        System.out.println(book.getTitle());
        book.setTitle("updated");
        System.out.println(book.getTitle());
        dao.update(book);
        System.out.println(dao.findAllBooks());
        dao.delete(book);
        System.out.println(dao.findAllBooks());


    }
}
