package com.mycompany.controller;

import com.mycompany.model.Author;
import com.mycompany.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/author")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable(value = "id") Long id) {
        Author author = authorService.getAuthorById(id);
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(author);
    }

    @PostMapping("/author")
    public void saveAuthor(@RequestBody Author author) {
        authorService.createAuthor(author);
    }


}
