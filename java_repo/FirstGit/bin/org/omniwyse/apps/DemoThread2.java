package org.omniwyse.apps;

public class DemoThread2 extends Thread {

	@Override
	public void run() {
		super.run();
		System.out.println("Inside run method");
		go();
	}
	
	public void go() {
		
		System.out.println("Inside go method");
		more();
		
	}
	
	private void more() {
		
		System.out.println("Inside more method");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Thread thread = new DemoThread2();
		
		thread.start();
		
		System.out.println("Inside main");
		
		
	}
	

}
