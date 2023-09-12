import java.util.Collections;
import java.util.PriorityQueue;

public class HeapMax {

	public static void main(String[] args) {
        // use Collections.reverseOrder() to reverse heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        heap.add(11);
        heap.add(2);
        heap.add(10);
        heap.add(7);
        heap.add(3);
        heap.add(8);
        System.out.println("Size of heap : " + heap.size());
        System.out.println("Max in heap : " +heap.peek());
        heap.poll();
        System.out.println("");

        System.out.println("After deletion!");
        System.out.println("Size of heap : " + heap.size());
        System.out.println("Max in heap : " +heap.peek());
		while(!heap.isEmpty()) {
			System.out.print(heap.poll()+ " ");
		}   
	}
}
