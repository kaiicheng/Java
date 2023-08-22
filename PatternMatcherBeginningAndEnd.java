// "\\" means \ in Java
// need \ for &^、$、.、|、?、*、+、(、)、{、}、[、]：

public class PatternMatcherBeginningAndEnd {
	public static void main(String[] args) {
		
		// ^ mean the beginning of string
		// \\d mean matching numbers from 0 to 9
		// * mean matching numbers with multiple times (>=0)
		System.out.println("123".matches("^\\d*"));  // true
		System.out.println("123".matches("^\\d.*"));  // true
		System.out.println("123abc".matches("^\\d.*"));  // true
		System.out.println("abc".matches("^\\\\d*"));  // false
		System.out.println();
		
		// $ mean the end of string
		// \\d mean matching numbers from 0 to 9
		// * mean matching numbers with multiple times (>=0)
		System.out.println("123".matches("\\d.*$"));  // true
		System.out.println("abc".matches("\\d.*$"));  // false
		System.out.println("123456789".matches("\\d.*$"));  // true
		System.out.println("abc123".matches("\\.d*$"));  // false
		System.out.println("123abc".matches("\\.d*$"));  // false
		System.out.println();
		
		// $ mean the end of string
		// [a-zA-Z] mean matching characters from A~Z and a~z
		// * mean matching numbers with multiple times (>=0)
		System.out.println("123".matches(".*[a-zA-Z]$"));  // false
		System.out.println("abcdef".matches(".*[a-zA-Z]$"));  // true
		System.out.println("abcdef123".matches(".*[a-zA-Z]$"));  // false
		System.out.println("123abcdef".matches(".*[a-zA-Z]$"));  // true
		System.out.println();
	}
}
