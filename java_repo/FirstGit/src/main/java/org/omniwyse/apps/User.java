package org.omniwyse.apps;

public class User {
	
	
	public void printUserType() {
		
		System.out.println("User");
	}
	
	
	public void saveWebLink() {
		
		System.out.println("User: saveWebLink");
		postAReview();
		
	}
	
	
	public void postAReview() {
		
		System.out.println("User: postAReview");
		
	}
	
	
	// Method binding demo
	public  static void  staticMethod() {
		
		System.out.println("User: static Method");
		
	}
	
	

}
