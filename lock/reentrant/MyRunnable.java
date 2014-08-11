package lock.reentrant;

public class MyRunnable implements Runnable{

	private Controller cont;
	private int data;

	public MyRunnable(Controller cont, int data) {
		this.cont = cont;
		this.data = data;
	}

	@Override
	public void run() {
		
		try {
			cont.modifyResourceByLock(this.data);
			//cont.modifyResourceByLockWithTimeout(this.data);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " was interrupted !");
		}
		
	}
	
	
}
