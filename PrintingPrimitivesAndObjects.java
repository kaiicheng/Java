
public class PrintingPrimitivesAndObjects {

	public static void main(String[] args) {

		int a = 5;
		System.out.println("a = " + a);
		
		boolean b = false;
		System.out.println("b = " + b);
		
		// Customer cannot be resolved to a type
//		Customer c = new Customer("Brandon");
//		System.out.println("c = " + c);
		
		System.out.println("toString = " + toString());
	}
	
	// need to tell Java what to print by defining the toString method in the class
	public String toString() {
		return "someString";
	}
}
