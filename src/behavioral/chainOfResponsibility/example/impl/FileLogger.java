package behavioral.chainOfResponsibility.example.impl;

import behavioral.chainOfResponsibility.example.AbstractLogger;

public class FileLogger extends AbstractLogger {
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void write(String message) {
        System.out.printf("[%s] [%s] %s%n", this.getClass().getSimpleName(), this.logLevel, message);
    }
}
