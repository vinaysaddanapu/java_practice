package org.omniwyse.apps;

class Abc implements Cloneable{
		
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
		
	
}

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		

		 Abc obj = new Abc();
		 obj.i = 5;
		 obj.j = 6;
		 
		 Abc obj1 = (Abc)obj.clone();
		 
		 obj1.j = 8;
		
		 
		 System.out.println(obj1);  // 5 8
		 System.out.println(obj); // 5 6		
		
	}
	
}
