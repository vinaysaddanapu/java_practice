package org.omniwyse.apps;

public class DemoObjectGetClass {

	public static void main(String[] args) {
		

		Object object = new String("omniwyse");
		
		 Class class1 = object.getClass();
		 
		 System.out.println(class1);
		
	}
}
