package org.omniwyse.apps;

import java.util.concurrent.TimeUnit;

public class DemoThread {
	
	      public static void main(String[] args) {
			  
	    	 Task task = new Task();
	    	 Thread thread = new Thread(task); // New state
	    	 thread.start();
	    	 //thread.start();
	    	 
	    	 try {
				//Thread.sleep(3000);
				TimeUnit.SECONDS.sleep(5);
				
	    		 
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	    	 
	    	 System.out.println("Inside main method");
	    	  
	    	  
		}
	
}

class Task implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Inside run method");
		go();
		
	}
	
	public void go() {
		
		System.out.println("Inside go method");
		more();
	}

	private void more() {

		System.out.println("inside more method");
	}
		
}
