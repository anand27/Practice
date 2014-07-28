package pattern.chain_of_responsibility;

public abstract class AbstractLogger {
	
	private AbstractLogger nextLogger;

	protected LogLevel LEVEL;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void logMessage(LogLevel level, String message){
		if(this.LEVEL == level){
			this.writeMessageToDest(message);
		}else{
			this.getNextLogger().logMessage(level, message);
		}
	}
	
	protected abstract void writeMessageToDest(String message);

}
