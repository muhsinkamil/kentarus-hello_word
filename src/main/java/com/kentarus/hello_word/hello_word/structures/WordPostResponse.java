package com.kentarus.hello_word.hello_word.structures;

public class WordPostResponse {
    private String status;
    private String message;

    public WordPostResponse(String status, String message) {
        this.status = status;
        this.message = message; 
    }

    public String getMessage() {
        return message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }


}
