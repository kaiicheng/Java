
public class MostSpecificMethod {

	public static void myPrint(double d) {
		System.out.println("double: " + d);
	}
	
	public static void myPrint(int i) {
		System.out.println("int: " + i);
	}
	
	public static void main(String[] args) {
		MostSpecificMethod.myPrint(5);  // prints "int: 5" using myPrint(int i)
		MostSpecificMethod.myPrint(5.0);  // prints "double: 5.0" using myPrint(double d)
	}
}
