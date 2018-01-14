package com.mycompany.exception;

/**
 * Created by HP on 2018-01-14.
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Could not found book " + id);
    }
}
