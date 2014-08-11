package lock.reentrantReadWrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import lock.reentrant.Resource;

public class Controller {

	Resource res;
	ReadWriteLock lock;
	
	public Controller() {
		res = new Resource(0);
		lock = new ReentrantReadWriteLock(true);
	}
	
	public Resource getRes() {
		return res;
	}

	public void writeoResource(int data) {
		
		System.out.println(Thread.currentThread().getName() + " waiting for write lock");
		
		lock.writeLock().lock();
		
		System.out.println(Thread.currentThread().getName() + " acquired write lock");
		
		res.setData(data);
		
		System.out.println(Thread.currentThread().getName() + " performed write");

		System.out.println(Thread.currentThread().getName() + " released write lock");
		
		lock.writeLock().unlock();
	
	}

	public int readFromResource() throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName() + " waiting for read lock");
		
		lock.readLock().lock();
		
		System.out.println(Thread.currentThread().getName() + " acquired read lock");

		Thread.sleep(5000);
		
		int val = res.getData();
		
		System.out.println(Thread.currentThread().getName() + " read -> " + val);
		
		System.out.println(Thread.currentThread().getName() + " released read lock");
		
		lock.readLock().unlock();
		
		return val;
	}
	
}
