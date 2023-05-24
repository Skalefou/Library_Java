package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book searchBook(String title) {
        return books.stream().filter(book -> Objects.equals(book.getTitle(), title)).findFirst().orElse(null);
    }

    public void loanBook(String title, String borrower)
    {
       Book result = searchBook(title);
        if (result == null || result.getBorrower() == null) {
            throw new RuntimeException("Livre indisponible ou inexistant");
        }
        result.loanTo(borrower);
    }
}
