package pattern.command;

import java.util.ArrayList;
import java.util.List;

public class FileInvoker {

	private List<Command> listOfCommands;
	
	public FileInvoker() {
		this.listOfCommands = new ArrayList<Command>();
	}
	
	public void addcommand(Command com){
		this.listOfCommands.add(com);
	}
	
	public void execute(){
		for(Command com : this.listOfCommands){
			com.execute();
		}
	}
	
}
