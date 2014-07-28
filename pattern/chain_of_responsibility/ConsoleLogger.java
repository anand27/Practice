package pattern.chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(LogLevel level){
      this.LEVEL = level;
    }

	@Override
	protected void writeMessageToDest(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}
