package behavioral.chainOfResponsibility.example;

import java.util.Objects;

public abstract class AbstractLogger {

    protected LogLevel logLevel;
    protected AbstractLogger nextLogger;

    public enum LogLevel {
        TRACE,DEBUG,INFO,WARNING,ERROR
    }

    public AbstractLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LogLevel logLevel, String message) {
        if (this.logLevel.compareTo(logLevel) >= 0) {
            write(message);
        }

        if (Objects.nonNull(this.nextLogger)) {
            this.nextLogger.logMessage(logLevel, message);
        }
    }

    abstract public void write(String message);
}
