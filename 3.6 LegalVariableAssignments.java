
public class LegalVariableAssignments {

	public static void main(String[] args) {
		
		// widening 
		double d = 5;  // legal
		System.out.println(d);
		
		// narrowing
//		int i = 3.5;  // illegal
		
		// cast
		int j = (int)(Math.round(3.5));
		System.out.println(j);
	}
}
