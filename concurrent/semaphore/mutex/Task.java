package concurrent.semaphore.mutex;

import java.util.concurrent.Semaphore;

public class Task implements Runnable {

	private Semaphore sem;
	
	public Task(Semaphore semaphore) {
		this.sem = semaphore;
	}

	@Override
	public void run() {

		System.out.println("-----> "+ Thread.currentThread().getName() +" started, doing some work...");
		
		try {
			
			this.sem.acquire();
			
			Thread.sleep(5000);
			
			this.sem.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----> "+ Thread.currentThread().getName() +" finished working.");
	}

}
