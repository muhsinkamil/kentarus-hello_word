package com.kentarus.hello_word.hello_word.services;

import org.springframework.stereotype.Service;

@Service
public class WordService {
    private String word = "No words posted yet !!";

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
