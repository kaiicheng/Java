/*
 * Input: This is a happy week!
 */

import java.util.Scanner;

public class HasnextWhileLoop {
	public static void main(String[] args) {
		
		System.out.println("Input: ");
		
		Scanner sc = new Scanner(System.in);
			
		String[] str = new String[100];
		int i = 0;
		
		while (sc.hasNext()) { 

			str[i] = sc.next();
			System.out.println(i +": " + str[i]);
			i++;
			
//			for (int j = 0; j < i; j++) { 
//				System.out.println(str[j]);
//			}
		}
		
		// The close() method is to close the scanner
		sc.close();
	}
}
