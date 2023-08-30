import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		// sort
		int [] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
		Arrays.sort(a);

		System.out.println("Array a:");

		for (int i = 0; i < a.length; i++) {
			// 0 1 2 3 4 5 6 7 8 9 
			System.out.print(a[i] + " ");
			
		}
		System.out.println("");
		
		// sort from element indexing 0 to element indexing 3-1=2 
		int [] b = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
		Arrays.sort(b, 0, 3);
		
		System.out.println("Array b:");

		for (int i = 0; i < a.length; i++) {
			// 7 8 9 2 3 4 1 0 6 5 
			System.out.print(b[i] + " ");
		}
		
	}
}
