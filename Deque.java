import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {
	public static void main(String[] args) {

		ArrayDeque<String> deque = new ArrayDeque<>();

		// add element
		deque.add("element 1");
		deque.add("element 2");
		// add element to the end
		deque.addLast("element 3");
		// add element to the beginning
		deque.addFirst("element 0");
		
		// check the size of deque
		int size = deque.size();
		System.out.println("Size of deque is :" + size);
		
		// check if deque contains the specific element
		boolean containsElement1 = deque.contains("element 2");
		System.out.println("Deque caontains elemet 2: " + containsElement1);
		
		// offer adds element to the end and return true
		System.out.println(deque.offer("element 4"));
		// offer adds element to the beginning and return true
		System.out.println(deque.offerFirst("element -1"));
		// offer adds element to the end and return true
		System.out.println(deque.offerLast("element 5"));
		
		System.out.println(deque);

		// check the first element
		String firstElement = deque.peek();
		System.out.println(firstElement);
		// check the first element
		String firstElement2 = deque.peekFirst();
		System.out.println(firstElement2);
		// check the last element
		String lastElement = deque.peekLast();
		System.out.println(lastElement);

		// get the first element and not delete
		String firstElement4 = deque.getFirst();
		System.out.println(firstElement4);
		// get the first element and not delete
		String lastElement2 = deque.getLast();
		System.out.println(lastElement2);

		System.out.println(deque);
		
		// remove the first element and return it
		String removedElement = deque.remove();
		System.out.println(removedElement);
		// remove the first element and return it
		String removedElement2 = deque.removeFirst();
		System.out.println(removedElement2);
		// remove the last element and return it
		String removedElement3 = deque.removeLast();
		System.out.println(removedElement3);
		
		System.out.println(deque);
		
		// iterate the deque using iterator
		Iterator<String> iterator = deque.iterator();
		System.out.print("Deque: ");
		while(iterator.hasNext()){
		  String element = iterator.next();
		  System.out.print(element + " ");
		}
		System.out.println("");

		// iterate the deque using for-loop
		System.out.print("Deque: ");
		for(String i : deque) {
		    System.out.print(i + " ");
		}
		System.out.println("");

		// remove the first element and return it
		String removedElement4 = deque.poll();
		System.out.println(removedElement4);
		// remove the first element and return it
		String removedElement5 = deque.pollFirst();
		System.out.println(removedElement5);
		// remove the last element and return it
		String removedElement6 = deque.pollLast();
		System.out.println(removedElement6);
		
		System.out.println(deque);

		// pop remove the first element
		String removedElement7 = deque.pop();
		System.out.println(removedElement7);

		
		System.out.println(deque);

	}
}
