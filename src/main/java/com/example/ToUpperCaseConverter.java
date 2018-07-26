package com.example;

public class ToUpperCaseConverter implements MessageConverter {
    @Override
    public String convert(String message) {
        return message.toUpperCase();
    }
}
