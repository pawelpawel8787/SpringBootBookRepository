package com.mycompany.exception;

/**
 * Created by HP on 2018-01-14.
 */
public class PublisherNotFoundException extends RuntimeException {
    public PublisherNotFoundException(Long id) {
        super("Could not found publisher " + id);
    }
}
