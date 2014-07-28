package pattern.command;

public class WriteFileCommand implements Command {
 
    private FileSystem fileSystem;
     
    public WriteFileCommand(FileSystem fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
