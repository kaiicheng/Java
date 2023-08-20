import java.util.regex.Pattern;

public class PatternMatches {
	public static void main(String[] args) {
		
		// + mean matching number with multiple times (>=1)
		System.out.println(Pattern.matches("\\d+",""));  // false
		System.out.println(Pattern.matches("\\d+","2223"));  // true
		System.out.println(Pattern.matches("\\d+","2223456789"));  // true
		System.out.println(Pattern.matches("\\d+","2223aa"));  // false
		System.out.println(Pattern.matches("\\d+","22bb23"));  // false
	}
}
