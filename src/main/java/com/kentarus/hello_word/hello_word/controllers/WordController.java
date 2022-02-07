package com.kentarus.hello_word.hello_word.controllers;

import com.kentarus.hello_word.hello_word.services.WordService;
import com.kentarus.hello_word.hello_word.structures.WordPostResponse;
import com.kentarus.hello_word.hello_word.structures.WordRequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/word")
public class WordController {

    @Autowired
    WordService wordService;

    @GetMapping
    public String getWord() {
        return wordService.getWord();
    }

    @PostMapping
    public ResponseEntity<WordPostResponse> postWord(@RequestBody(required = false) WordRequestBody wordBody) {
        if(wordBody.getValue() != null && wordBody.getValue().trim().length() > 1) {
            wordService.setWord(wordBody.getValue());
            return ResponseEntity.ok().body(new WordPostResponse("OK", ""));
        }
        return ResponseEntity.badRequest().body(new WordPostResponse("NOK", "Body cannot be empty"));
    }
}
