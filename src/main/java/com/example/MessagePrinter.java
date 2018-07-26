package com.example;

public class MessagePrinter {
    private final MessageConverter messageConverter;

    public MessagePrinter(MessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    public void printMessage(String message) {
        System.out.println(messageConverter.convert(message));
    }
}
