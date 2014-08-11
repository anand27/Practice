package lock.reentrant;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
	
		Controller cont = new Controller();
		
		MyRunnable r1 = new MyRunnable(cont, 55);
		MyRunnable r2 = new MyRunnable(cont, 88);
		
		Thread t1 = new Thread(r1, "thread 1");
		Thread t2 = new Thread(r2, "thread 2");
		
		t1.start();
		t2.start();
		
		/*Thread.sleep(2000);
		t1.interrupt();*/
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------");
		System.out.println(cont.getRes().getLastModifiedBy());
		System.out.println("--------------------------------------");
		System.out.println(cont.getRes().getData());
		System.out.println("--------------------------------------");
	}
	
}
