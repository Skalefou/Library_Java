package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Pensée pour moi-même", new Publisher("Hachette", "prout")));
        books.add(new Book("Les aventures de Gérard", new Publisher("Nathan", "Rue de saint-jacque")));
        books.add(new Book("Raoul le livre", new Publisher("Nathan", "Yippie")));
        books.add(new Book("rthrthth", new Publisher("Hachette", "prout")));
        books.add(new Book("Prthbwdthe", new Publisher("Hachette", "prout")));
        Library library = new Library();
        for(Book book : books)
        {
            library.addBook(book);
        }
        System.out.println(library.searchBook("Pensée pour moi-même").getTitle());

    }
}
