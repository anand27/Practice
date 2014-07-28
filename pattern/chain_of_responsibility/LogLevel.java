package pattern.chain_of_responsibility;

public enum LogLevel {

	INFO(1), ERROR(3), DEBUG(2);
	
	private int level;
	
	LogLevel(int level){
		this.level = level;
	}
	
}
