package concurrent.semaphore.signalling;

import java.util.concurrent.Semaphore;

public class ReceiverTask implements Runnable {

	private Semaphore sem;
	
	public ReceiverTask(Semaphore semaphore) {
		this.sem = semaphore;
	}

	@Override
	public void run() {
		
		System.out.println("receiver started ... acquiring semaphore...");
		
		try {
			this.sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("receiver doing some work now...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("receiver finished working.");

	}

}
