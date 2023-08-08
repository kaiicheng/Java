
public class Employee {

	// instance variable: different for every instance of emplyee
	String name;
	
	// static variable: common to all instances of the class
	static String DEPARTMENT = "IT";
	
	public Employee(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {

		Employee employee1 = new Employee("Alice");
		Employee employee2 = new Employee("Bob");
		System.out.println(employee1.name);
		System.out.println(employee2.name);
		
		// reference a static variable with a class name, not an instance of a class
		//even if we create multiple instances of Employee, every employee will have the same value for DEPARTMENT
		System.out.println(Employee.DEPARTMENT);
	}
}
