package com.mycompany.service;

import com.mycompany.interfaces.AuthorService;
import com.mycompany.model.Author;
import com.mycompany.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Author getAuthorById(Author author) {
        return null;
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return null;
    }

    @Override
    public void deleteAuthor(Author author) {

    }
}
