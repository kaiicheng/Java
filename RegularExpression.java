// "\\" means \ in Java
// need \ for &^、$、.、|、?、*、+、(、)、{、}、[、]：

public class RegularExpression {
	public static void main(String[] args) {
		
		// match numbers from 0 to 9
		System.out.println("123".matches("\\d\\d\\d"));  // true
		System.out.println("123abc".matches("\\d\\d\\d"));  // false
		System.out.println();
		
		// match characters/underscore/number
		System.out.println("a_bc".matches("\\w\\w\\w\\w"));  // true
		System.out.println("a_b$".matches("\\w\\w\\w\\w"));  // false, $ is not characters/underscore/number
		System.out.println();
		
		// mix
		System.out.println("123abc".matches("\\d\\d\\d\\w\\w\\w"));  // true
		System.out.println();
		
		// * mean matching numbers with multiple times (>=0)
		System.out.println("".matches("\\w*"));  // true
		System.out.println("123".matches("\\d*"));  // true
		System.out.println("123456789".matches("\\d*"));  // true
		System.out.println();
		
		// + mean matching characters/underscore/number with multiple times (>=1)
		System.out.println("".matches("\\w+"));  // false
		System.out.println("a12".matches("\\w+"));  // true
		System.out.println("ab12".matches("\\w+"));  // true
		System.out.println();
		
		// ? mean matching 0 or 1 time
		System.out.println("12".matches("\\w?12")); // true
		System.out.println("012".matches("\\w?12")); // true
		System.out.println("a12".matches("\\w?12")); // true
		System.out.println();
		
		// {x} mean matching x times
		System.out.println("12".matches("\\d{2}"));  // true
		System.out.println("12".matches("\\d{3}"));  // false
		System.out.println("a12".matches("\\w{1,3}")); // true
		System.out.println("a123".matches("\\w{1,3}")); // false		
	}
}
