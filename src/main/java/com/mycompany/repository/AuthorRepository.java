package com.mycompany.repository;

import com.mycompany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Long> {
    public Author findById(long id);
    public Author findByName(String name);

}
