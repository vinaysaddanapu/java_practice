package org.omniwyse.apps;

import java.util.concurrent.locks.ReentrantLock;

class Display {
	
	ReentrantLock l = new ReentrantLock(); 
	
	public  void wish(String name) {
		
		l.lock();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Good morning :");
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {}
				
				System.out.println(name);
			}
		 
		    l.unlock();
		
			}
	
}
	
	
  class DispThread extends Thread {
		
		Display display; 
		String name;
		
		public DispThread(Display display, String name) {
	
			this.display = display;
			this.name = name;
		}
		
		@Override
		public void run() {
			
			display.wish(name);
			
		}
		
  }
		
	

public class MainThread {
	
       public static void main(String[] args) {
		   
    	   Display d1 = new Display();
    	   
    	   Display d2 = new Display();
    	   
    	   DispThread t1 = new DispThread(d1,"Dhoni");
    	   DispThread t2 = new DispThread(d2,"Yuvraj");
    	   
    	   t1.start();
    	   t2.start();
    	   
	}
	
	
}
