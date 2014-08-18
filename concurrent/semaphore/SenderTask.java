package concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SenderTask implements Runnable {

	private Semaphore sem;
	
	public SenderTask(Semaphore semaphore) {
		this.sem = semaphore;
	}

	@Override
	public void run() {

		System.out.println("-----> sender started ... doing some work...");
		
		try {
			
			Thread.sleep(5000);
			
			this.sem.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----> sender finished working.");
	}

}
