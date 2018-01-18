package com.mycompany.exception;

import com.mycompany.model.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handlerException(BookNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Blad"));
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity handlerException(AuthorNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Blad"));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity handlerException(CategoryNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Blad"));
    }

    @ExceptionHandler(PublisherNotFoundException.class)
    public ResponseEntity handlerException(PublisherNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Blad"));
    }


}
