package org.omniwyse.apps;

import java.lang.reflect.Method;

// Reflection API
public class ReflectionDemo {
	
	public static void main(String[] args) throws Exception {
		
		    Class  c  =  Class.forName("org.omniwyse.apps.Test");
		    Test test =   (Test)c.newInstance();
		    
		    System.out.println(test);
		    
		    
		     Method method = c.getDeclaredMethod("show", null);
		     method.setAccessible(true);
		     method.invoke(test,null);
		    
		    
		
		
	}

}
