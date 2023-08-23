
public class PatternReplaceAll {
	public static void main(String[] args) {

		// use <b>$1<b> to replace keyword having the length of 4
		String s = "the quick brown fox jumps over the lazy dog.";
		String r = s.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
		System.out.println(r); // the quick brown fox jumps <b>over</b> the <b>lazy</b> dog.

		// use <b>$1<b> to replace keyword having the length of 5
		String s2 = "the quick brown fox jumps over the lazy dog.";
		String r2 = s2.replaceAll("\\s([a-z]{5})\\s", " <b>$1</b> ");
		System.out.println(r2); // the quick brown fox jumps <b>over</b> the <b>lazy</b> dog.
	
		// use <b>$1<b> to replace keyword having the length of 3~5
		String s3 = "the quick brown fox jumps over the lazy dog.";
		String r3 = s3.replaceAll("\\s([a-z]{3,5})\\s", " <b>$1</b> ");
		System.out.println(r3); // the quick brown fox jumps <b>over</b> the <b>lazy</b> dog.
	
		// name the expression as four, and catch later
		String s4 = "the quick brown fox jumps over the lazy dog.";
		String r4 = s4.replaceAll("\\s(?<four>[a-z]{4})\\s", " <b>${four}</b> ");
		System.out.println(r4); // the quick brown fox jumps <b>over</b> the <b>lazy</b> dog.	
	}
}
