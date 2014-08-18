package concurrent.semaphore.counting;

import java.util.concurrent.Semaphore;

public class CountingSemaporeTest {

	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(5, true);
		
		Thread t1 = new Thread(new Task(sem));
		Thread t2 = new Thread(new Task(sem));
		Thread t3 = new Thread(new Task(sem));
		Thread t4 = new Thread(new Task(sem));
		Thread t5 = new Thread(new Task(sem));
		Thread t6 = new Thread(new Task(sem));
		Thread t7 = new Thread(new Task(sem));
		Thread t8 = new Thread(new Task(sem));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
	}
}
