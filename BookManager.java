import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();

        books.add(new Book("Pan Tadeusz", "Adam Mickiewicz", "978-83-01-00000-1", 1834));
        books.add(new Book("Lalka", "Bolesław Prus", "978-83-01-00000-2", 1890));
        books.add(new Book("Krzyżacy", "Henryk Sienkiewicz", "978-83-01-00000-3", 1900));
        books.add(new Book("Potop", "Henryk Sienkiewicz", "978-83-01-00000-4", 1886));
        books.add(new Book("Ogniem i mieczem", "Henryk Sienkiewicz", "978-83-01-00000-5", 1884));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void updateBook(String isbn, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }
}
