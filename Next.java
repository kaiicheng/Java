/*
 * next() will stop when encountering a space " "
 * Input: 123 456
 * Output: 123
 */
import java.util.Scanner;

public class Next {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str1 = null;
			System.out.println("Input: ");
			str1 = sc.next();
			System.out.println("Output: ");
			System.out.println(str1);
		}
	}
}
