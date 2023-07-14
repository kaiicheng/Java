// InvalidModuleDescriptorException when running my first java app
// https://stackoverflow.com/questions/51133398/invalidmoduledescriptorexception-when-running-my-first-java-app

/*
 * My first Java Class
 * @author kaiicheng
 */

import java.util.Scanner;

public class FirstClass {

	/*
	 * This is the javadoc for a Java method. It's equivalent to a docstring for a function in Python.
	 * The main method is the entry point of any Java program.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello Kai!");
		System.out.println();
		
		/*
		 * defining variables
		 */

		int x = 5;
		
		double y = 5.0;
		
		boolean flag = true;
		
		/*
		 * concatenate strings to non-strings with "+", and then the result is a new string
		 */
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("flag: " + flag);
		
		/*
		 * strings and characters
		 */
		
		String dept = "cit";
		char letter = 'a';
		
		String course = dept + 590; // string with int
		String grade = letter + ""; // char with string

		String courseInformation = course + ": " + grade;
		System.out.println(courseInformation);
		
		/*
		 * math operations
		 */
		
		double d = 2 * x + 10;
		double z = 2 * y + 5;
		
		System.out.println();
		System.out.println("d: " + d);
		System.out.println("z: " + z);
		
		// division with ints
		// uses integer division and ignores the remainder
		
		System.out.println("x / 2: " + (x / 2));
		
		// division with floats
		System.out.println("x / 2.0: " + (x / 2.0));
		
		// power operation
		System.out.println("x pow 4: " + Math.pow(x, 4));
		
		/*
		 * string operations
		 */
		
		// string concatenation
		String fullName = "Kai" + " " + "Cheng" + " ";
		String fullNameUpper = fullName.toUpperCase();
		
		System.out.println(fullNameUpper);
		
		/*
		 * conditionals and loops
		 */
		
		// conditional checking if x is even, using the modulus or % operator
		System.out.println();  // blank line
		System.out.println("x: " + x);

		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
		
		double e = 2.3;
		double f = 2.4;
		double g = 2.5;
		
		// boolean operators
		// && (and) - true only if both operands are true
		if (e > 2 && e < f) {
			System.out.println(e + " is between 2 and " + f);
		}
		
		// || (or) - true if either operand is true
		if (f > e || f > g) {
			System.out.println(f + " is greater than " + e + " or greater than " + g);
		}
		
		// while loops
		int i = 0;
		
		System.out.println();  // blank line

		while (i < 5) {
			System.out.println("i: " + i);
			
			i++;  // same as i = i + 1
		}
		
		// for loops
		System.out.println();

		for (int k = 0; k < 10; k++) {
			System.out.println("k: " + k);
		}
		
		/*
		 * casting
		 */
		
		// cast int to string
		String inToString = Integer.toString(1);
		
		// cast double to string
		String doubleToString = Double.toString(1.1);
		
		// print the values and type of values
		System.out.println();  // blank line
		System.out.println(inToString + " " + inToString.getClass());
		System.out.println(doubleToString + " " + doubleToString.getClass());

		// 8 primitive types in Java:
		// boolean, byte, char, short, int, long, float, and double
		// they can't call methods like getClass()
		
		// cast string to int
		int stringToInt = Integer.parseInt("1");
		
		// cast string to double
		double stringToDouble = Double.parseDouble("1.1");
		
		// print values and type of values
		System.out.println(stringToInt);  // blank line
		// cast to object then call getClass()
		//(Object) casts a primitive data type to its wrapper class
		// a wrapper class is a class whose object wraps or contains a primitive data type
		System.out.println(((Object)stringToInt).getClass());  // blank line
		
		// print values and type of values
		System.out.println(stringToDouble);  // blank line
		// cast to object then call getClass()
		System.out.println(((Object)stringToDouble).getClass());  // blank line
		
		/*
		 * user input
		 */
		
		// import java.util.Scanner;
		System.out.println(); //blank line
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int myInt = scan.nextInt();  // get next input as int
		
		System.out.println("Your number is: " + myInt);
		
		// print the multiplication table up to 10 for myInt
		for (int t = 1; t < 11; t++) {
			// print t * myInt
			System.out.println(t + " x " + myInt + ": " + (t * myInt));
		}
		
		System.out.println(); //blank line
		System.out.println("Enter a String: ");
		String myStr = scan.next(); // get next input value as string
		
		// print each char in myStr separately
		for (int u = 0; u < myStr.length(); u++) {
			// print char at index u
			System.out.println(myStr.charAt(u)); //blank line
		}
		
		// always close scanner
		scan.close();
	}
}
