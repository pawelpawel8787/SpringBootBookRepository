package com.mycompany.repository;

import com.mycompany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AuthorRepository extends JpaRepository<Author, Long> {
    public Optional<Author> findById(long id);
    public Author findByName(String name);



}
