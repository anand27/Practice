package concurrent.lock.reentrant;

public class ModifyResourceTask implements Runnable{

	private Controller cont;
	private int data;

	public ModifyResourceTask(Controller cont, int data) {
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
