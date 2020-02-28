package org.omniwyse.apps;

public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread(new EmailCampaign());
		Thread t2 = new Thread(new DataAggregator());
		
		
		//setting thread names
		t1.setName("EmailCampaign");
		t2.setName("DataAggregator");
		
		// Setting thread priority
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
        		
       t1.start();
       t2.start();
       
       
       try {
    	   
		//t2.join(); // join() - Main thread is suspended until t2 dies
		  t2.join(1);
    	   
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
       
       System.out.println("Inside main");

		
	}

}


class EmailCampaign implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 8; i++) {
			System.out.println(Thread.currentThread().getName());
			
	     if (i == 5) {
	    	Thread.currentThread().yield();
			
		}
			
	}
	}
	
}
	
	
	
	
class DataAggregator implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 8; i++) {
			
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
	
	
	

	
	
}
