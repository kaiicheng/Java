import java.util.regex.Pattern;

public class PatternSplit {
	public static void main(String[] args) {
		
		// create a regular expression
		Pattern p=Pattern.compile("\\d+");
		
		String[] str = p.split("My name is: Kai My phone:0123456 My Email:helloworld@kai.com");
//		String[] str = p.split("a 1 player 2 or 3 nothing");

		System.out.println(str[0]);
		System.out.println(str[1]);
	}
}
