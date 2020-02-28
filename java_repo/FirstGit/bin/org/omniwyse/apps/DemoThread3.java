package org.omniwyse.apps;

class MyThread extends Thread{
	
	
	int[] values = {6,8,3,7,9};

	@Override
	public void run() {
		
		super.run();
		
		for (int i = 0; i < values.length; i++) {
			
			values[i] = values[i]*2;
			
		}
		
		System.out.println("After multipling values");
		for (int i = 0; i < values.length; i++) {
			
			System.out.println(values[i]);
		}
	}
	
}

public class DemoThread3 {
	
	public static void main(String[] args) {
		
		
		 System.out.println(Thread.currentThread().getThreadGroup().getName());
		 System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		   Thread t1 = new MyThread();
		   t1.start();
		   
		   
		  
		   
		   
		
	}
	
	

}
