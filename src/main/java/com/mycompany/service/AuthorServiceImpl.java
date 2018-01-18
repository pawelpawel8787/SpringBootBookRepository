package com.mycompany.service;

import com.mycompany.exception.AuthorNotFoundException;
import com.mycompany.exception.BookNotFoundException;
import com.mycompany.interfaces.AuthorService;
import com.mycompany.model.Author;
import com.mycompany.model.Book;
import com.mycompany.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id){
        Optional<Author> author = authorRepository.findById(id);
        if (author.isPresent()){
            return author.get();
        }else
            throw new AuthorNotFoundException(id);
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Author author) {
       authorRepository.delete(author);
    }
}
