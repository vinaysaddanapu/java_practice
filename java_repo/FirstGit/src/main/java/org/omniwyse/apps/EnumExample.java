package org.omniwyse.apps;


enum Mobile{
	
	APPLE(100),SAMSUNG,HTC(80);
	
	int price;
	
	
	Mobile() {
		
		price = 80;
		System.out.println("Constructor");
		
	}
	
	Mobile(int p){
		
		price = p;
	}
	
         public int getPrice() {
		
		      return price;
	}
	
}

public class EnumExample {
	
	public static void main(String[] args) {
	
		
		
		System.out.println(Mobile.APPLE.getPrice());
		
		
	}

}
