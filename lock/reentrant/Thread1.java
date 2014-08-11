package lock.reentrant;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
	
		Controller cont = new Controller();
		
		MyRunnable r1 = new MyRunnable(cont, 55);
		MyRunnable r2 = new MyRunnable(cont, 88);
		MyRunnable r3 = new MyRunnable(cont, 44);
		MyRunnable r4 = new MyRunnable(cont, 100);
		
		Thread t1 = new Thread(r1, "thread 1");
		Thread t2 = new Thread(r2, "thread 2");
		Thread t3 = new Thread(r3, "thread 3");
		Thread t4 = new Thread(r4, "thread 4");
		
		//fairness policy
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		Thread.sleep(20000);
		
		System.out.println("--------------------------------------");
		System.out.println(cont.getRes().getLastModifiedBy());
		System.out.println("--------------------------------------");
		System.out.println(cont.getRes().getData());
		System.out.println("--------------------------------------");
	}
	
}
