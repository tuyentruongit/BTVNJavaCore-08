import enity.Book;
import enity.Reader;

public class BookManagement {
    private Book book;
    private Reader reader;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "BookManagement{" +
                "book=" + book +
                ", reader=" + reader +
                '}';
    }
}
