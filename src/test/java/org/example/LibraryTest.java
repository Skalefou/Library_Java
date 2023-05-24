package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A library")
public class LibraryTest {
    Library library;
    String[] title;
    Book book;
    Book book1;
    Book book2;

    @BeforeEach
    public void setUp() {
        library = new Library();
        title = new String[]{"Tieryrytle", "Title2", "Title3"};
        book = new Book("Title", new Publisher("Name", "Address"));
        book1 = new Book("Title2", new Publisher("Name2", "Address2"));
        book2 = new Book("Title3", new Publisher("Name3", "Address3"));
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void searchBookTestNull() {
        Book bookRes = library.searchBook(title[0]);
        Assertions.assertNull(bookRes);
    }

    @Test
    public void searchBookTest() {
        Book bookRes = library.searchBook(title[1]);
        Assertions.assertNotNull(bookRes);
        Assertions.assertEquals(bookRes.getTitle(), "Title2");
    }
}
