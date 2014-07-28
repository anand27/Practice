package pattern.chain_of_responsibility;

public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		
		AbstractLogger chain = getChainOfLoggers();
		
		chain.logMessage(LogLevel.INFO, "I am info");
		chain.logMessage(LogLevel.DEBUG, "I am debug");
		chain.logMessage(LogLevel.ERROR, "I am error");
		
		
	}

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger logger1 = new ConsoleLogger(LogLevel.INFO);
		AbstractLogger logger2 = new ErrorLogger(LogLevel.ERROR);
		AbstractLogger logger3 = new DebugLogger(LogLevel.DEBUG);

		logger1.setNextLogger(logger2);
		logger2.setNextLogger(logger3);
		
		return logger1;
	}
}
