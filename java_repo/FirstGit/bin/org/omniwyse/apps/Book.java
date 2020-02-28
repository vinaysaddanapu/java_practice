package org.omniwyse.apps;


public class Book {
public enum BookGenre {
	
    BIOGRAPHY (12) {
    	public boolean isKidFriendly(int age) {
          return  age >=  minAgeToRead;
    			
        	}	
    },
	HORROR (15) {
    	public boolean isKidFriendly(int age) {
        	 return  false;
    				
    	}
    	
    	
    	
    };
	
	private BookGenre(int minAgeToRead) {
		
		this.minAgeToRead = minAgeToRead;
	}
	
	
	protected int minAgeToRead;
	public int getMinAgeToRead() {
		
		return minAgeToRead;
		
	}
	
	public abstract boolean isKidFriendly(int age);
	

    /*public boolean isKidFriendly(int age) {
    	switch (this) {
		case BIOGRAPHY : return  age >=  minAgeToRead;
		case HORROR :	return false;
			
    	}
    	
    	return false;
		
	}*/
    
}


public static void main(String[] args) {
	
	for(BookGenre bookGenre : BookGenre.values()) {
		
		System.out.print("Name: "+ bookGenre);  // toString
        System.out.println(",name() "+ bookGenre.name());
        System.out.println("Ordinal: "+ bookGenre.ordinal());
        System.out.println("Declaring class: "+ bookGenre.getDeclaringClass());
        System.out.println("compareTo(HORROR): "+ bookGenre.compareTo(BookGenre.HORROR));
        System.out.println("equals(HORROR): "+ bookGenre.equals(BookGenre.HORROR));
        System.out.println("minAgeToRead: "+ bookGenre.getMinAgeToRead());
        System.out.println("isKidFriendly: "+ bookGenre.isKidFriendly(25));
        
        
		
	}

}

}
