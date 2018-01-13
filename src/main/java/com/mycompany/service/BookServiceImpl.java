package com.mycompany.service;

import com.mycompany.interfaces.BookService;
import com.mycompany.model.Book;
import com.mycompany.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Book book = bookRepository.findOne(id);
        return book;
    }

    @Override
    public Book createBook(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public void deleteBook(Book book) {

    }
}
