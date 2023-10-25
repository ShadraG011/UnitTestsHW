package hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gbhomeworks.hw4.Book;
import ru.gbhomeworks.hw4.BookRepository;
import ru.gbhomeworks.hw4.BookService;
import ru.gbhomeworks.hw4.InMemoryBookRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookTests {
    InMemoryBookRepository im;
    @BeforeEach
    void initData(){
        im = new InMemoryBookRepository();
    }

    @Test
    void testBookRepositoryFindAll(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookRepository.findAll()).thenReturn(im.findAll());

        List<Book> books = bookService.findAllBooks();

        verify(bookRepository, times(1)).findAll();
        assertThat(books).isNotEmpty().hasSize(2).isEqualTo(im.findAll());

    }

    @Test
    void testBookRepositoryFindById(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookRepository.findById("1")).thenReturn(im.findById("1"));

        Book book = bookService.findBookById("1");

        verify(bookRepository, times(1)).findById("1");
        assertThat(book).isEqualTo(im.findById("1"));

    }

    @Test
    void testGetId(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        assertThat(book.getId()).isEqualTo("1");
    }

    @Test
    void testSetId(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        book.setId("2");

        assertThat(book.getId()).isEqualTo("2");
    }

    @Test
    void testGetTitle(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        assertThat(book.getTitle()).isEqualTo("testTitle1");
    }

    @Test
    void testSetTitle(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        book.setTitle("testTitle2");

        assertThat(book.getTitle()).isEqualTo("testTitle2");
    }

    @Test
    void testGetAuthor(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        assertThat(book.getAuthor()).isEqualTo("testAuthor1");
    }

    @Test
    void testSetAuthor(){
        Book book = new Book("1", "testTitle1", "testAuthor1");

        book.setAuthor("testAuthor2");

        assertThat(book.getAuthor()).isEqualTo("testAuthor2");
    }


}
