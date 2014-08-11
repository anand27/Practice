package lock.reentrantReadWrite;


public class WriterTask implements Runnable {

	private Controller cont;
	private int data;

	public WriterTask(Controller cont, int data) {
		this.cont = cont;
		this.data = data;
	}
	
	@Override
	public void run() {

		cont.writeoResource(data);
		
	}

}
