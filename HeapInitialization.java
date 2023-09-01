/*
 * Queue is FIFO.
 * PriorityQueue has priority when doing offer(), peek(), and remove().
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapInitialization {
	public static void main(String[] args) {
		
		// initialization
    	PriorityQueue<Integer> heap = new PriorityQueue<>();
    	
		int [] nums = {3, 7, 4, 8, 3, 2, 9};
		
		// offer() add element to the heap
		for (int i: nums) {
			System.out.print(i + " ");
			heap.offer(i);
		}
		System.out.println();
		
		// peek() to see the root element
    	System.out.println(heap.peek());
		
		// poll() remove the element
		while(!heap.isEmpty()) {
			System.out.print(heap.poll()+ " ");
		}
		System.out.println();
		System.out.println();

		
		
		// initialization
        Queue<String> q = new PriorityQueue<>();
        
        // offer() add element
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        
        // poll() poll element based on the priority
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // null, because the heap is empty
		
	}
}
