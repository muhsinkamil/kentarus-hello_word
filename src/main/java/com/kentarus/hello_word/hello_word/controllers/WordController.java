package com.kentarus.hello_word.hello_word.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/word")
public class WordController {
    @GetMapping
    public String getWord() {
        return "Hello world";
    }
}
