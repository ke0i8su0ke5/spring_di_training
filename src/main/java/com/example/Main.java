package com.example;

public class Main {
    public static void main(String[] args) {
        MessageConverter messageConverter = new ToUpperCaseConverter();
        MessagePrinter messagePrinter = new MessagePrinter(messageConverter);

        messagePrinter.printMessage("Hello World");
    }
}
