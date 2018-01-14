package com.mycompany.controller;

import com.mycompany.model.Book;
import com.mycompany.model.Publisher;
import com.mycompany.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class PublisherController {

    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping("/publisher")
    public List<Publisher> getAllPublisher(){
        return publisherService.getAllPublisher();
    }
    @GetMapping("/books/{id}")
    public ResponseEntity<Publisher> findPublisherById(@PathVariable(value = "id") Long id){
        Publisher publisher = publisherService.getPublisherById(id);
        if (publisher == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(publisher);
    }

    @PostMapping("/books")
    public void saveBook(@RequestBody Publisher publisher){
        publisherService.createPublisher(publisher);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Publisher> deleteBookById(@PathVariable(value = "id") Long id){
        Publisher publisher = publisherService.getPublisherById(id);
        if (publisher == null){
            return ResponseEntity.notFound().build();
        }
        publisherService.deletePublisher(publisher);
        return ResponseEntity.ok(publisher);
    }


}
