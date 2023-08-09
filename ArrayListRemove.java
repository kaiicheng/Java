import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		// remove element by element name
		
        // create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Names ArrayList: " + names);

        // remove element Bob
        boolean result = names.remove("Bob");
        System.out.println("Bob deleted? " + result);
        System.out.println("After remove(): " + names);
		System.out.println("\n");
        
        
		
		// remove element by index
		
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        
        System.out.println("Numbers ArrayList: " + numbers);

        // remove element indexing 2
        Integer element = numbers.remove(2);
        System.out.println("After remove(): " + numbers);
        System.out.println("Element deleted: " + element);
		System.out.println("\n");

        
        
		// remove the first element appearing multiple times
		
        // create an ArrayList
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        // add elements
        randomNumbers.add(22);
        randomNumbers.add(13);
        randomNumbers.add(35);
        randomNumbers.add(13);
        randomNumbers.add(40);
        System.out.println("ArrayList: " + randomNumbers);

        // delete the first element 13
        // Integer.valueOf() make 13 change from int to Integer object
        boolean deleted = randomNumbers.remove(Integer.valueOf(13)); // remove the first 13
        System.out.println("13 deleted? " + deleted);
        System.out.println("After remove(): " + randomNumbers);
        
	}
}
