package com.urlshortener.urlshortener.Services;

import org.springframework.stereotype.Service;


public class MyDataException extends RuntimeException {
    public MyDataException(String message) {
        super(message);
    }
}
