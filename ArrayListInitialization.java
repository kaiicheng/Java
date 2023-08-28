/*
 * The length of ArrayList is flexible.
 * Can expand ArrayList later.
 * ArrayList only allows object entries, but not support primitive data types。
 * Unlike Array.
 */

import java.util.ArrayList;

public class ArrayListInitialization {
	public static void main(String[] args) {
		
        // ArrayList
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);
        
        // add element to ArrayList 
        arrL.add(1); 
        arrL.add(2); 
  
        // access element indexing 0
        System.out.println(arrL.get(0)); 
		

  
        // not allows primitive data types
//        ArrayList<char> arrL = new ArrayList<char>();   // error

        // allows object entities
        ArrayList<Integer> arrL1 = new ArrayList<>(); 
        ArrayList<String> arrL2 = new ArrayList<>(); 
        ArrayList<Object> arrL3 = new ArrayList<>(); 
	}
}
