package concurrent.synchronizer.barrier;

import java.util.concurrent.CyclicBarrier;


public class BarrierTest {

	public static void main(String[] args) {
		
		BarrierActionOneTask barrierActionOne = new BarrierActionOneTask();
		BarrierActionTwoTask barrierActionTwo = new BarrierActionTwoTask();
		
		CyclicBarrier c1 = new CyclicBarrier(2, barrierActionOne);
		CyclicBarrier c2 = new CyclicBarrier(2, barrierActionTwo);
		
		Thread t1 = new Thread(new Task(c1, c2));
		Thread t2 = new Thread(new Task(c1, c2));
		
		t1.start();
		t2.start();
		
	}
}
