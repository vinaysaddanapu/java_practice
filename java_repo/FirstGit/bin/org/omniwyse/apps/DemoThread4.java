package org.omniwyse.apps;

class Hi extends Thread{
	
	@Override
	public void run(){
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Hi");
			try { Thread.sleep(500); } catch (InterruptedException e) {}
			
		}
		
	}
	
	
}

class Hello extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Hello");
			try{ Thread.sleep(500); }catch (InterruptedException e) {};
				
		}
		
	}
	
	
}

public class DemoThread4 {
	
	public static void main(String[] args) {
		
		// object instantiation
		Hi obj1 = new Hi();
		Hello obj2 =  new Hello();
		
		
		obj1.start();
		try{ Thread.sleep(500); }catch (InterruptedException e) {};
		obj2.start();
		
	
	}

}
