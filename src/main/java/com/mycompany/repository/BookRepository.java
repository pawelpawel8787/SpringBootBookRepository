package com.mycompany.repository;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by HP on 2018-01-13.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    public Optional<Book> findById(long id);
    public Book findByTitle(String title);

}
