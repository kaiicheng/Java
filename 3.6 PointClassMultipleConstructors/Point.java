/**
 * You should  overload a method when you want to essentially the same thing, but with different parameters
 * Represents a point with x and y.
 * @author kai
 *
 */
public class Point {
	
	//instance vars
	
	/**
	 * x for point.
	 */
	int x;
	
	/**
	 * y for point.
	 */
	int y;
	
	/**
	 * sum of x and y.
	 */
	int sum;
	
	//constructors
	
	/**
	 * Creates a point at the given x and y.
	 * @param x for point
	 * @param y for point
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.sum = x + y;
	}
	
	/**
	 * Creates a point at 0, 0.
	 */
	public Point() {
		// Here, the keyword "this" is used to invoke the current class constructor
		//calls first constructor with default values, 0 and 0
		this(0, 0);
	}
	
	public static void main(String[] args) {
		
		Point point1 = new Point(2, 4);
		System.out.println(point1.x);
		System.out.println(point1.y);
		System.out.println(point1.sum);
		
		Point point2 = new Point();
		System.out.println(point2.x);
		System.out.println(point2.y);
		System.out.println(point2.sum);
	}
}
