package com.mycompany.exception;

/**
 * Created by HP on 2018-01-14.
 */
public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super("Could not found category " + id);
    }
}
