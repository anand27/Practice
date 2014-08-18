package concurrent.synchronizer.exchanger;

import java.util.concurrent.Exchanger;

public class Task implements Runnable {

	Exchanger<Payload> exchanger = null;
    Payload payload = null;

    public Task(Exchanger<Payload> exchanger, Payload payload) {
        this.exchanger = exchanger;
        this.payload = payload;
    }
    
	@Override
	public void run() {
		
		Payload old = this.payload;
		
		try {
			
			System.out.println(Thread.currentThread().getName() + " ready for exchange...");
			
			this.payload = this.exchanger.exchange(old);
			
			System.out.println(Thread.currentThread().getName() +"'s exchange successful !");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " exchanged " + old + " for " + this.payload);
		

	}

}
