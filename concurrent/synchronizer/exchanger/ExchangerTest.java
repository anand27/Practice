package concurrent.synchronizer.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
	
	public static void main(String[] args) {
		
		Exchanger<Payload> exchanger = new Exchanger<Payload>();
		
		Thread t1 = new Thread(new Task(exchanger, new Payload("Payload 1", 472)));
		t1.start();
		
		Thread t2 = new Thread(new Task(exchanger, new Payload("Payload 2", 322)));
		t2.start();
		
	}
	
}
