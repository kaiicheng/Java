import java.util.regex.Pattern;

public class PatternSplit {
	public static void main(String[] args) {
		
		
		// \\s mean space
		String str1[] = "a b c".split("\\s");  // { "a", "b", "c" }
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		System.out.println();
		
		// \\s mean space
		// + mean matching with multiple times (>=1)
		String str2[] = "a b  c".split("[\\s]+");  // { "a", "b", "c" }
		System.out.println(str2[0]);
		System.out.println(str2[1]);
		System.out.println(str2[2]);
		System.out.println();
		
		String str3[] = "a,,, b ;; c".split("[\\,\\;\\s]+");  // { "a", "b", "c" }
		System.out.println(str3[0]);
		System.out.println(str3[1]);
		System.out.println(str3[2]);
		System.out.println();
		
		// create a regular expression
		// d mean matching numbers from 0 to 9
		// + mean matching with multiple times (>=1)
		Pattern p=Pattern.compile("\\d+");
		
		String[] str = p.split("My name is: Kai My phone:0123456 My Email:helloworld@kai.com");
//		String[] str = p.split("a 1 player 2 or 3 nothing");

		System.out.println(str[0]);
		System.out.println(str[1]);
	}
}
