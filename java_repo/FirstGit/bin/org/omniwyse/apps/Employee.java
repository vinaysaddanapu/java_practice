package org.omniwyse.apps;

public class Employee {
	
	int id;
	String name;
	Address address;
	

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public void display() {
		
		System.out.println(id+" "+name);
		System.out.println("Address: "+address.city+" "+address.state+" "+address.country);
		
	}
	
	
	public static void main(String[] args) {
		
		Address address1 = new Address("hyderabad", "telangana", "India");
		Address address2 = new Address("chennai", "tamilnadu", "India");
		Address address3 = new Address("pune", "maharastra", "India");
		
		
		Employee employee1 = new Employee(1, "varun", address1);
		Employee employee2 = new Employee(2, "vamshi", address2);
		Employee employee3 = new Employee(3, "sandeep", address3);
		
		
		employee1.display();
		employee2.display();
		employee3.display();
		
		
		
	}
	

}
