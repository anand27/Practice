package concurrent.synchronizer.latch;

import java.util.concurrent.CountDownLatch;

public class LatchTest {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		DecrementerTask d = new DecrementerTask(latch);
		WaiterTask w1 = new WaiterTask(latch);
		WaiterTask w2 = new WaiterTask(latch);
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(w1);
		Thread t3 = new Thread(w2);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
