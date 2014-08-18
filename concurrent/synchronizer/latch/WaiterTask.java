package concurrent.synchronizer.latch;

import java.util.concurrent.CountDownLatch;

public class WaiterTask implements Runnable{

    CountDownLatch latch = null;

    public WaiterTask(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
        	
        	System.out.println(Thread.currentThread().getName() + " waiting for latch to open...");

        	latch.await();
            
            // critical section
            
            System.out.println(" Thread name - < " + Thread.currentThread().getName() + " > ");
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
