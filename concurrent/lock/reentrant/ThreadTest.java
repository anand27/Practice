package concurrent.lock.reentrant;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
	
		Controller cont = new Controller();
		
		ModifyResourceTask r1 = new ModifyResourceTask(cont, 55);
		ModifyResourceTask r2 = new ModifyResourceTask(cont, 88);
		ModifyResourceTask r3 = new ModifyResourceTask(cont, 44);
		ModifyResourceTask r4 = new ModifyResourceTask(cont, 100);
		
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
