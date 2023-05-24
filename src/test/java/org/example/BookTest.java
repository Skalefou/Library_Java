package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A book")
public class BookTest {

    Book book;
    Book book1;
    Book book2;

    @BeforeEach
    public void setUp() throws Exception {
        book = new Book("Title", new Publisher("Name", "Address"));
        book1 = new Book("Title2", new Publisher("Name2", "Address2"));
        book2 = new Book("Title3", new Publisher("Name3", "Address3"));
    }

    @Test
    @DisplayName("Can be loaned is not already borrowed")
    public void loanTo() {
        Book book = new Book("titre", new Publisher("name", "addr"));
        Assertions.assertNull(book.getBorrower());
        book.loanTo("borrower");
        Assertions.assertEquals(book.getBorrower(), "borrower");
    }

    @Test
    @DisplayName("Can have a title")
    public void setTitleTest() {
        book.setTitle("Yes");
        Assertions.assertEquals(book.getTitle(), "Yes");
    }
}