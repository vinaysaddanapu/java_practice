package org.omniwyse.apps;

class DemoImmutability{
	
	final int x;

	public DemoImmutability(int x) {
		super();
		this.x = x;
	}
	
	
	public int getX() {
		
		return x;
	}
	
}


public class ClassImmutability {
	
	public static void main(String[] args) {
		
		
		DemoImmutability demoImmutability = new DemoImmutability(10);
		
		System.out.println(demoImmutability.getX());
	
	}
}
