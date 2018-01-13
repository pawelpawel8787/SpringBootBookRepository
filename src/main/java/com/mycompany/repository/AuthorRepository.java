package com.mycompany.repository;

import com.mycompany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-13.
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
