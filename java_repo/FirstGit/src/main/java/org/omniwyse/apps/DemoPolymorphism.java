package org.omniwyse.apps;


class Parent{
	
	public void method1() {
		
		System.out.println("Parent: method");
	}
	
	

}

class Child extends Parent{
	
	
	public void method1() {
		
		System.out.println("Child: method");
		
	}
	
	
    public void method2() {
		
		System.out.println("Parent: method2");
		
	}
	
}

public class DemoPolymorphism {

	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		
		
		Parent parent = new Child();
		parent.method1();
		///parent.method2(); we cannot access parent class methods
 		
	}
}
