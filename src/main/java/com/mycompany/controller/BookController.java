package com.mycompany.controller;

import com.mycompany.model.Book;
import com.mycompany.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable(value = "id") Long id){
        Book book = bookService.getBookById(id);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(book);
    }


}
