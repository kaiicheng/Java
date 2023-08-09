
public class StaticVariablesCircle {

	// static variable
	static final double PI = 3.1415;
	
	public static double calculateArea(double radius) {
		
		// reference the static variable using the full class name
		return (StaticVariablesCircle.PI * (radius * radius));
	}
	
	public static void main(String[] args) {
		System.out.println(calculateArea(5));
	}
}
