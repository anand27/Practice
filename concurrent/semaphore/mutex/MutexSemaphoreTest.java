package concurrent.semaphore.mutex;

import java.util.concurrent.Semaphore;

public class MutexSemaphoreTest {

public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(1, true);
		
		Thread t1 = new Thread(new Task(sem));
		Thread t2 = new Thread(new Task(sem));
		Thread t3 = new Thread(new Task(sem));
		Thread t4 = new Thread(new Task(sem));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
