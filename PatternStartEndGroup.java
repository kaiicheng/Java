import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternStartEndGroup {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("([a-z]+)(\\d+)"); 
		Matcher m=p.matcher("aaa2223bb"); 
		
		// find() matches any location of the string
		System.out.println(m.find());  // matches aaa2223 
		
		System.out.println(m.groupCount());  // 2, return the number of group ("(...)") in regular expression
		
		System.out.println(m.start(1));  // 0, matches [a-z] and a...
		
		System.out.println(m.start(2));  // 3, matches (\\d+) and ...2...
		
		System.out.println(m.end(1));   // 3
		
		System.out.println(m.end(2));   // 7, matches (\\d+) and ...3...
		
		System.out.println(m.group(1));  // aaa
		System.out.println(m.group(2));  // 2223
		System.out.println();
		
		
		
		Pattern p2=Pattern.compile("\\d+"); 
		Matcher m2=p2.matcher("My name is:456456 Phone:0532214 Email:aaa123@aaa.com"); 
	
		while(m2.find()) { 
		     System.out.println("group: " + m2.group()); 
		     System.out.print("start:" + m2.start()); 
		     System.out.println(" end:" + m2.end()); 
		} 
	}
}
