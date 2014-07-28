package pattern.command;

public class OpenFileCommand implements Command{

	private FileSystem fileSystem;
    
    public OpenFileCommand(FileSystem fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }
}
