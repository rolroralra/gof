package behavioral.chainOfResponsibility.example.impl;

import behavioral.chainOfResponsibility.example.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void write(String message) {
        System.out.printf("[%s] %s%n", this.getClass().getSimpleName(), message);
    }
}
