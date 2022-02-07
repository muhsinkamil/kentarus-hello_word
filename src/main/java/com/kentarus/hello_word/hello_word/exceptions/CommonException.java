package com.kentarus.hello_word.hello_word.exceptions;

import com.kentarus.hello_word.hello_word.structures.WordPostResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CommonException  {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleException(Exception ex, WebRequest req) {
        return new ResponseEntity<>(new WordPostResponse("NOK", "Oh oh problem occured !!, Check your body and try again"), HttpStatus.BAD_REQUEST);
    }
}
