package com.mycompany.exception;

/**
 * Created by HP on 2018-01-14.
 */
public class AuthorNotFoundException extends RuntimeException {

    public AuthorNotFoundException(Long id) {
        super("Could not found author " + id);
    }
}
