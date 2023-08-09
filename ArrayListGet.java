import java.util.ArrayList;

public class ArrayListGet {

	public static void main(String[] args) {

        // create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Names ArrayList: " + names);

        // get element indexing 1
        String num1 = names.get(1);
        System.out.println("Number 1 element: " + names.get(0));
        System.out.println("Number 2 element: " + num1);
        
        
        
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(22);
        numbers.add(13);
        numbers.add(35);
        
        System.out.println("Numbers ArrayList: " + numbers);

        // get element indexing 2
        int num2 = numbers.get(2);
        System.out.println("Number 3 element: " + num2);
	}
}
