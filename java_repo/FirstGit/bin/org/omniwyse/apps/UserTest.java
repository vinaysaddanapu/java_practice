package org.omniwyse.apps;

public class UserTest {
	
	// Implementing Polymorphism.
	
	public void printUserType(User user) {
		
		user.printUserType();
		
	}
	
	
	public static void main(String[] args) {
	
	//part 1
	//User user = new User();
	//User staff = new Staff();
    //User Editor = new Editor();
    
    
    
   // UserTest test = new UserTest();
    //test.printUserType(user);
    //test.printUserType(staff);
    //test.printUserType(Editor);
    
    //part 2
    //Editor.postAReview();
    //Editor.saveWebLink();
    
    //Method Binding demo
    User staff = new Editor();
    staff.staticMethod();  //Early binding
    ((Staff)staff).staticMethod(); //To get method from staff class we should perform down casting.
    

}
}