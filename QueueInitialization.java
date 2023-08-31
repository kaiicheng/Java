import java.util.LinkedList;
import java.util.Queue;

public class QueueInitialization {
	public static void main(String[] args) {

		//add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        
        // add element to the beginning of the queue
        queue.add("0");
        
        // add element to the end
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.print(q + " ");
        }
        System.out.println("");
        
        // remove() removes the first element
        System.out.println("Element removed: " + queue.remove());
        for(String q : queue){
            System.out.print(q + " ");
        }
        System.out.println("");
        
        // poll() polls (removes) the first element
        System.out.println("Element polled: " + queue.poll());
        for(String q : queue){
            System.out.print(q + " ");
        }
        System.out.println("");
        
        // element() return the first element and not delete
        System.out.println("Element returned:"+queue.element());
        for(String q : queue){
            System.out.print(q + " ");
        }
        System.out.println("");
        
        // peek() see the first element
        System.out.println("peek: "+queue.peek());
        for(String q : queue){
            System.out.print(q + " ");
        }
	}
}
