package org.omniwyse.apps;

class Hurray implements Runnable{
	
	@Override
	public void run(){
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Hi");
			try { Thread.sleep(500); } catch (InterruptedException e) {}
			
		}
		
	}
	
	
}

  class Hola implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Hello");
			try{ Thread.sleep(500); }catch (InterruptedException e) {};
				
		}
		
	}
	
	
}
public class DemoThread5 {
	
	public static void main(String[] args) {
		
		Hurray hurray = new Hurray();
		Hola hola = new Hola();
		
		Thread thread = new Thread(hurray);
		Thread thread2 = new Thread(hola);
		
		
		thread.start();
		thread2.start();
		
	}
	
	

}
