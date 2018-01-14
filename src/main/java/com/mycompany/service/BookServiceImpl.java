package com.mycompany.service;

import com.mycompany.exception.BookNotFoundException;
import com.mycompany.interfaces.BookService;
import com.mycompany.model.Book;
import com.mycompany.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

//    @Override
//    public Book getBookById(Long id) {
//        Optional<Book> book = bookRepository.findOne(id);
//        return book;
//    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(Long id){
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()){
            return book.get();
        }else
            throw new BookNotFoundException(id);
    }

    public Book getBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
