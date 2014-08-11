package lock.reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Controller {

	Resource res;
	Lock lock;
	
	public Controller() {
		res = new Resource(0);
		lock = new ReentrantLock(true);
	}
	
	public void modifyResourceByLock(int data) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName() + " waiting for lock");
		
		lock.lock();
		
		System.out.println(Thread.currentThread().getName() + " acquired lock");
		
		Thread.sleep(1500);
		this.res.setData(data);
		this.res.setLastModifiedBy(Thread.currentThread().getName());
		
		countToHundred();
		
	}

	private void countToHundred() {
		for(int i=0; i<1000; i++){
			System.out.print(i);
		}
		
		System.out.println(Thread.currentThread().getName() + " finished executing critical section");
	
		System.out.println(Thread.currentThread().getName() + " released lock");
		
		// we can release lock in another method
		lock.unlock();
	}
	
	public void modifyResourceByLockWithTimeout(int data) throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName() + " waiting for lock");
		
		if(lock.tryLock(5, TimeUnit.SECONDS)){
			
			System.out.println(Thread.currentThread().getName() + " acquired lock");
			
			Thread.sleep(15000);
			this.res.setData(data);
			this.res.setLastModifiedBy(Thread.currentThread().getName());
			
			countToHundred();
			
			System.out.println(Thread.currentThread().getName() + " released lock");
		}else{
			System.out.println("Resource busy.. "+Thread.currentThread().getName()+" exiting");
		}
		
	}

	public Resource getRes() {
		return res;
	}

}
