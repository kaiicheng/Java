/*
 * find() matches any location of the string
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFind {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.find());  // true 
		Matcher m2=p.matcher("aa2223"); 
		System.out.println(m2.find());  // true 
		Matcher m3=p.matcher("aa2223bb"); 
		System.out.println(m3.find());  // true 
		Matcher m4=p.matcher("aabb"); 
		System.out.println(m4.find());  // false 
		
	}
}
