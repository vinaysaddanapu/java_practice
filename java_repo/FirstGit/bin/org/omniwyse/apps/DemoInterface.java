package org.omniwyse.apps;

interface Tablet{
	
	void call();
	 
	
}

class SamSung implements Tablet{
	
	@Override
	public void call() {
		
		System.out.println("Samsung Mobile");
		
	}
	
	public void apps() {
		
		System.out.println("Play store");
		
	}
	
	
}

public class DemoInterface  {
	
	public static void main(String[] args) {
		
		
		SamSung samSung = new SamSung();
		samSung.call();
		samSung.apps();
		
		
		Tablet tablet = new SamSung();
		tablet.call();
	 //	tablet.apps();  we cannot implement abstract methods in interface.

		
	}
	

}
