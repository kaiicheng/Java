/*
 * The length of Array is fixed when initializing an array.
 * Cannot expand Array later.
 * Array allows primitive data types and object entities
 * Unlike ArrayList.
 */

public class Array {
	public static void main(String[] args) {
        
		// Array
        int[] arr = new int[2]; 
		
        // add element to array
        arr[0] = 1;
        arr[1] = 2;
        // arr[12] = 3;  // incorrect, Index out of bounds for length 2
        
		// access element indexing 0
        System.out.println(arr[0]); 
        
        
        
        // allows primitive data types
        int[] array2 = new int[3]; 
        System.out.println(array2[0]); 

        // allows object entities
//        test[] array1 = new test[3]; 

        
	}
}
