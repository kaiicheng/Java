/**
 * Represent a customer with name, ID, and geography.
 * @author kai
 *
 */

import java.util.ArrayList;

public class Customer {

	//static variables
	//shared across all instances of Customer
	
	/**
	 * Company for all customers.
	 */
	// add the final keyword after static, if a  static variable is never going to change
	static final String COMPANY = "CVS";
	
	/**
	 * Store list of all customers.
	 */
	static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
	
	/**
	 * To generate and keep track of customer IDs.
	 */
	// use all uppercase characters when defining static variables
	static Counter COUNTER;
	
	//instance variables
	
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Geography of customer.
	 */
	String geography;
	
	/**
	 * ID of customer.
	 */
	int ID;
	
	
	
	//constructor
	
	public Customer(String name, String geography) {
		this.name = name;
		this.geography = geography;
		
		//get unique ID from counter
		this.ID = Customer.COUNTER.getCount();
		
		//increment counter
		Customer.COUNTER.increment();
		
		//adds this customer to list of all customers
		// within a constructor or an instance method, "this" is a reference to the current object.
		// it can be passed to other instance methods as a variable.
//		System.out.println("this: " + this);  // this: 1: chenyun, Company: CVS, Location: Los Angeles
		Customer.CUSTOMERS.add(this);
	}
	
	//methods
	
	/**
	 * Prints all customers for the company.
	 */
	// a static method can call only other static methods and can not call a non-static method
	public static void printAllCustomers() {
		System.out.println("All customers: ");
		
		//iterate over statically references list of customers
		for (Customer c : Customer.CUSTOMERS) {
			System.out.println(c);
		}
		
		System.out.println("\n");
	}
	
	/**
	 * Compares two customers for equality.
	 * If they have the same name and geography, they are equal.
	 */
	public boolean equals(Object obj) {
		
		//cast object to customer, ( ) required!
		Customer otherCustomer = (Customer) obj;
		
		//compare name and geography for customers
		if ((this.name.equals(otherCustomer.name) && (this.geography.equals(otherCustomer.geography)))) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Returns ID, name of customer, and geography.
	 */
	public String toString() {
		return this.ID + ": " + this.name + ", Company: " + Customer.COMPANY + ", Location: " + this.geography;
	}
	
	/**
	 * Locates the given customer in the list of customers.
	 * @param customer to look up
	 * @return index of the given customer in the list, otherwise -1
	 */
	public static int findCustomer(Customer customer) {
		
		//set default index
		int index = -1;
		
		//iterate over customer list and locate given customer
		for (int i = 0; i < Customer.CUSTOMERS.size(); i++) {
//			System.out.println(Customer.CUSTOMERS.get(i));  // chenyun, Company: CVS, Location: Los Angeles
			if (Customer.CUSTOMERS.get(i).equals(customer)) { //will call equals method in customer class
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * Removes the given customer from list of customers.
	 * @param customer to remove
	 */
	public static void removeCustomer(Customer customer) {
		
		//find the customer
		int removeIndex = Customer.findCustomer(customer);
		
		//check if index is valid, then remove customer
		if (removeIndex >= 0) {
			Customer.CUSTOMERS.remove(removeIndex);
		}
	}
	
	public static void main(String[] args) {
		
		//initialize the counter for generating unique IDs for each customer
		Customer.COUNTER = new Counter(1);  // if Counter(0) will start to count from 0
		
		//create customer
		Customer c1 = new Customer("Alice", "Los Angeles");
		
		//print all customers
		Customer.printAllCustomers();
		
		//create customer
		Customer c2 = new Customer("Bob", "NYC");
		
		//print all customers
		Customer.printAllCustomers();
		
		//create customer
		Customer c3 = new Customer("Charlie", "Australia");
		
		//print all customers
		Customer.printAllCustomers();
		
		//remove customer
		Customer.removeCustomer(c1);
		
		//print all customers
		Customer.printAllCustomers();		
	}
}
