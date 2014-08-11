package lock.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Controller {

	Resource res;
	Lock lock;
	
	public Controller() {
		res = new Resource(0);
		lock = new ReentrantLock();
	}
	
	public void modifyResource(int data) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName() + " waiting for lock");
		
		lock.lock();
		
		System.out.println(Thread.currentThread().getName() + " acquired lock");
		
		Thread.sleep(10000);
		
		this.res.setData(data);
		this.res.setLastModifiedBy(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName() + " finished executing critical section");
		
		lock.unlock();
		
		System.out.println(Thread.currentThread().getName() + " released lock");
	}

	public Resource getRes() {
		return res;
	}
	
	
}
