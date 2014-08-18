package concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class SignallingSemaphoreTest {

	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(0);
		
		SenderTask sender = new SenderTask(semaphore);
		ReceiverTask receiver = new ReceiverTask(semaphore);
		
		Thread t1 = new Thread(sender);
		Thread t2 = new Thread(receiver);

		t1.start();
		t2.start();
		
	}
}

