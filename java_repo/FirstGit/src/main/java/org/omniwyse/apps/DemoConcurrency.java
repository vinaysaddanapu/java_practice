package org.omniwyse.apps;

import java.util.concurrent.locks.ReentrantLock;

public class DemoConcurrency {
	
	public static void main(String[] args) {
		
		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		lock.lock();
	
		System.out.println("isLocked :" + lock.isLocked());
		System.out.println("isHeldByCurrentThread :" + lock.isHeldByCurrentThread());
		System.out.println("getQueueLength :" + lock.getQueueLength());
		
		lock.unlock();
		
		System.out.println("getHoldCount :" + lock.getHoldCount());
		System.out.println("isHeldByCurrentThreadlock :"+lock.isHeldByCurrentThread());
		System.out.println("isLocked :" + lock.isLocked());
		
		lock.unlock();
		
		System.out.println("isLocked :" + lock.isLocked());
		System.out.println("isFair :" + lock.isFair());
		
		
	}

}
