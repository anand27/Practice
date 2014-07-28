package pattern.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(LogLevel level){
      this.LEVEL = level;
   }

	@Override
	protected void writeMessageToDest(String message) {
		System.err.println("Error Console::Logger: " + message);
	}

}
