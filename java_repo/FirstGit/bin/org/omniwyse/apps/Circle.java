package org.omniwyse.apps;

class Operation{
	
	int square(int n) {
		
		return n*n;
	}
	
}


public class Circle {
	
     Operation operation;  //Aggregation
     double d = 3.14;
       
     
     double area(int radius) {
    	 
    	 operation = new Operation();
    	 int rsquare = operation.square(radius);
    	 return d*rsquare;
    	 
    	 
     }
     
     
     public static void main(String[] args) {
		
    	 
    	 Circle circle = new Circle();
    	 double result = circle.area(5);
         System.out.println(result);    
          	 
    	 
    	 
	}
     
     
     
     
     

}
