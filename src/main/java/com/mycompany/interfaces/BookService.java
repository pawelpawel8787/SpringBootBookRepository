package com.mycompany.interfaces;

import com.mycompany.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * Created by HP on 2018-01-13.
 */
public interface BookService {

    List<Book> getAllBooks();
//    Optional <Book> getBookById(Long id);
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);

}
