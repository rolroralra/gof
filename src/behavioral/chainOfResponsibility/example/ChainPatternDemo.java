package behavioral.chainOfResponsibility.example;

import behavioral.chainOfResponsibility.example.impl.ConsoleLogger;
import behavioral.chainOfResponsibility.example.impl.ErrorLogger;
import behavioral.chainOfResponsibility.example.impl.FileLogger;

public class ChainPatternDemo {
	
	   private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.LogLevel.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.LogLevel.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.LogLevel.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }

	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.LogLevel.INFO,
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.LogLevel.DEBUG,
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.LogLevel.ERROR,
	         "This is an error information.");
	   }
}
