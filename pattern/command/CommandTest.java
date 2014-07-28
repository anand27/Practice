package pattern.command;

public class CommandTest {

	public static void main(String[] args) {
		
		FileSystem fs = FileSystemUtil.getUnderlyingFileSystem();
		
		OpenFileCommand of = new OpenFileCommand(fs);
		WriteFileCommand wf = new WriteFileCommand(fs);
		CloseFileCommand cf = new CloseFileCommand(fs);
		
		FileInvoker fi = new FileInvoker();
		fi.addcommand(of);
		fi.addcommand(wf);
		fi.addcommand(cf);
		
		fi.execute();
		
	}
	
	
	
}
