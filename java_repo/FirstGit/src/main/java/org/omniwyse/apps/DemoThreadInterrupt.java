package org.omniwyse.apps;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoThreadInterrupt {
	
	public static void main(String[] args) {
		
	Task task = new Task();
	
	Thread t1 = new Thread(task);
	
	t1.start();

	
	try { 
		
		//Thread.sleep(500);
		TimeUnit.SECONDS.sleep(5);
		t1.interrupt();
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
		
		
	}

}
