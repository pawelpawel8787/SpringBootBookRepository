package com.mycompany.controller;

import com.mycompany.model.Book;
import com.mycompany.service.BookServiceImpl;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable(value = "id") Long id){
        Book book = bookService.getBookById(id);
        if (book == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(book);
    }

    @PostMapping("/books")
    public void saveBook(@RequestBody Book book){
        bookService.createBook(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable(value = "id") Long id){
        Book book = bookService.getBookById(id);
        if (book == null){
            return ResponseEntity.notFound().build();
        }
        bookService.deleteBook(book);
        return ResponseEntity.ok(book);
    }



}
