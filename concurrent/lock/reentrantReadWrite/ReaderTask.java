package concurrent.lock.reentrantReadWrite;


public class ReaderTask implements Runnable{

	private Controller cont;

	public ReaderTask(Controller cont) {
		this.cont = cont;
	}
	
	@Override
	public void run() {
		
		try {
			cont.readFromResource();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
