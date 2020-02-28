package org.omniwyse.apps;

class Abb{
	
}

class A extends Abb {
		
}


interface B {

	
}

public class ReflectionDemo2 {
	
	public static void main(String[] args) throws Exception {
		
		
		Class class1 = Class.forName("org.omniwyse.apps.A");
		System.out.println("A: " + class1.isInterface());
		System.out.println("A: " + class1.getSuperclass());
		
		Class class2 = Class.forName("org.omniwyse.apps.B");
		System.out.println("B: " + class2.isInterface());
		System.out.println("B: " + class2.getSuperclass());
		
	}

}
