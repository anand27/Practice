package concurrent.synchronizer.latch;

import java.util.concurrent.CountDownLatch;

public class DecrementerTask implements Runnable {

    CountDownLatch latch = null;

    public DecrementerTask(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
        	
        	System.out.println("latch decrementing ");
        	
        	for(int i=0; i<3; i++){
        		Thread.sleep(1000);
        		this.latch.countDown();
        	}

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
