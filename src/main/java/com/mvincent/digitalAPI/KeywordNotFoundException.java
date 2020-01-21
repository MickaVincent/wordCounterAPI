package com.mvincent.digitalAPI;

public class KeywordNotFoundException extends RuntimeException {
    public KeywordNotFoundException(String keyword) {
        super("Could not find keyword " + keyword);
    }
}
