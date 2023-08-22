
public class PatternMatcherStringOr {
	public static void main(String[] args) {
		
		// || mean or
		System.out.println("i love you".matches("i love you") || "i love you".matches("i love dog"));
		System.out.println();
		
		// alternatively, | mean or
		System.out.println("i love you".matches("i love (you|dog)")); // true
		System.out.println("i love dog".matches("i love (you|dog)")); // true
		System.out.println();
		
		// case sensitive
		System.out.println("i love dog".matches("i love (you|Dog)")); // false
		System.out.println();
		
		// need (). Otherwise, it's choice between (i love you) and (dog)
		System.out.println("i love dog".matches("i love you|dog")); // false
		System.out.println("dog".matches("i love you|dog")); // true
		System.out.println();
	}
}
