import java.util.Stack;

public class StackInitialization {
		public static void main(String[] args) {
			
			// initialize a stack
			Stack<Character> stack=new Stack<>();
			System.out.println(stack);

			// check if the stack is empty
			System.out.println(stack.empty());

			// push() adds element to stack
			stack.push('a');
			stack.push('b');
			stack.push('c');
			stack.push('d');
			System.out.println(stack);
			
			// peek() checks the top (last) element
			System.out.println(stack.peek());
			System.out.println(stack);
			
			// pop() pop out the top (last) element
			stack.pop();
			System.out.println(stack);
			
			// find the index of an element
			// [a, b, c]
			System.out.println(stack.search('c'));  // 1
			System.out.println(stack.search('b'));  // 2
			System.out.println(stack.search('a'));  // 3
			
		}
	}