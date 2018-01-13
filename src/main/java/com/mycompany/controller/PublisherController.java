package com.mycompany.controller;

import com.mycompany.model.Publisher;
import com.mycompany.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherServiceImpl publisherService;
    @GetMapping
    public List<Publisher> getAllPublisher(){
        return publisherService.getAllPublisher();
    }
}
