package com.mycompany.service;

import com.mycompany.interfaces.PublisherService;
import com.mycompany.model.Publisher;
import com.mycompany.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService{

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher getPublisherById(Long id) {
        return null;
    }

    @Override
    public Publisher createPublisher(Publisher publisher) {
        return null;
    }

    @Override
    public Publisher updatePublisher(Publisher publisher) {
        return null;
    }

    @Override
    public void deletePublisher(Publisher publisher) {

    }
}
