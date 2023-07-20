import java.util.Map;
import java.util.HashMap;

// don't name the class "HashMap" which confuses Java with java.util.HashMap
public class JavaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	        // Creating an empty HashMap
//			Map<Integer, String> hash_map = new java.util.HashMap<>();
	        Map<Integer, String> hash_map = new HashMap<>();
	 
	        // Mapping string values to int keys
	        hash_map.put(10, "Hello");
	        hash_map.put(15, "world");
	        hash_map.put(20, "This");
	        hash_map.put(25, "is");
	        hash_map.put(30, "Hashmap");
	 
	        // Displaying the HashMap
	        System.out.println("Initial Mappings: " + hash_map);
	 
	        // replacing existing key along with new value
	        String returned_value = (String)hash_map.put(20, "Java");
	 
	        // Verifying the returned value
	        System.out.println("Returned value: " + returned_value);
	 
	        // Displaying the new map
	        System.out.println("New map: " + hash_map);
	        
	        // replacing non-existing key along with new value
	        returned_value = (String)hash_map.put(50, ".");
	 
	        // null
	        System.out.println("Returned value: " + returned_value);
	        
	        // Displaying the new map
	        System.out.println("New map: " + hash_map);
	    }
	}
