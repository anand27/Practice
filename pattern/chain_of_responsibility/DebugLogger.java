package pattern.chain_of_responsibility;

public class DebugLogger extends AbstractLogger {

   public DebugLogger(LogLevel level){
      this.LEVEL = level;
   }

	@Override
	protected void writeMessageToDest(String message) {
		System.out.println("File::Logger: " + message);
	}

}
