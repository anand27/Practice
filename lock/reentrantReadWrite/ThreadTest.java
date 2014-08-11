package lock.reentrantReadWrite;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Controller cont = new Controller();
		
		ReaderTask r1 = new ReaderTask(cont);
		ReaderTask r2 = new ReaderTask(cont);
		ReaderTask r3 = new ReaderTask(cont);
		ReaderTask r4 = new ReaderTask(cont);
		
		WriterTask w1 = new WriterTask(cont, 10);
		WriterTask w2 = new WriterTask(cont, 20);
		
		Thread t1 = new Thread(r1, "thread 1");
		Thread t2 = new Thread(r2, "thread 2");
		Thread t3 = new Thread(r3, "thread 3");
		Thread t4 = new Thread(r4, "thread 4");
		
		Thread t5 = new Thread(w1, "thread 55");
		Thread t6 = new Thread(w2, "thread 66");
		
		t1.start();
		t2.start();
		
		Thread.sleep(2000);
		
		t5.start();
		t6.start();
		
		Thread.sleep(2000);
		
		t3.start();
		t4.start();
	}
}
