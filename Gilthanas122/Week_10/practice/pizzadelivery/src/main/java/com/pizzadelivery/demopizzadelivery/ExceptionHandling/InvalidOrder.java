package com.pizzadelivery.demopizzadelivery.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class InvalidOrder extends RuntimeException {
    public InvalidOrder(String message) {
        super(message);
    }
}
