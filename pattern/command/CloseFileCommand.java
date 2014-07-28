package pattern.command;

public class CloseFileCommand implements Command {
 
    private FileSystem fileSystem;
     
    public CloseFileCommand(FileSystem fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
