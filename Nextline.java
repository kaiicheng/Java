/*
 * next() won't stop even when encountering a space " "
 * Input: 1 2 3 4 567
 * Output: 1 2 3 4 567
 */
import java.util.Scanner;

public class Nextline {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str1 = null;
			System.out.println("Input: ");
			str1 = sc.nextLine();
			System.out.println("Output: ");
			System.out.println(str1);
		}
	}
}
