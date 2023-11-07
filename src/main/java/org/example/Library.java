package org.example;

import java.util.Arrays;

public class Library {

    private Book[] books = new Book[10];

    public void AddBook()
    {
        books[0] = new Book("a","b","c");
        books[1] = new Book("A","B","C");
        books[2] = new Book("x","y","z");
    }




    @Override
    public String toString() {
        return "Library{" +
                "bookInfo=" + Arrays.toString(books) +
                '}';
    }
}
