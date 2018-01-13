package com.mycompany.interfaces;

import com.mycompany.model.Publisher;

import java.util.List;

/**
 * Created by HP on 2018-01-13.
 */
public interface PublisherService {

    List<Publisher> getAllPublisher();
    Publisher getPublisherById(Long id);
    Publisher createPublisher(Publisher publisher);
    Publisher updatePublisher(Publisher publisher);
    void deletePublisher(Publisher publisher);
}
