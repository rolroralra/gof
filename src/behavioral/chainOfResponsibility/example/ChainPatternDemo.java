package behavioral.chainOfResponsibility.example;

import behavioral.chainOfResponsibility.example.impl.ConsoleLogger;
import behavioral.chainOfResponsibility.example.impl.ErrorLogger;
import behavioral.chainOfResponsibility.example.impl.FileLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChainPatternDemo {
	private AbstractLogger loggerChain;

	@BeforeEach
	void setUp() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.LogLevel.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.LogLevel.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.LogLevel.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		loggerChain = errorLogger;
	}

   @Test
   public void test_ChainOfResponsibility_Pattern_Example() {
	  loggerChain.logMessage(AbstractLogger.LogLevel.INFO,
		 "This is an information.");

	  loggerChain.logMessage(AbstractLogger.LogLevel.DEBUG,
		 "This is an debug level information.");

	  loggerChain.logMessage(AbstractLogger.LogLevel.ERROR,
		 "This is an error information.");
   }
}
