package com.mycompany.interfaces;

import com.mycompany.model.Author;

import java.util.List;

/**
 * Created by HP on 2018-01-13.
 */
public interface AuthorService {

    List<Author> getAllAuthors();
    Author getAuthorById(Author author);
    Author createAuthor(Author author);
    Author updateAuthor(Author author);
    void deleteAuthor(Author author);
}
