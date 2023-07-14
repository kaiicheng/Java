
public class NonRectangularArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] table2 = {
				{1, 2}, 
				{3, 4},
				{5, 6}
		};

		// update the 3rd element in the array
		table2[2] = new int[20];

		System.out.println(table2[0][0]);
		
		
		int [][] table3 = {
				{1, 2}, 
				{3, 4},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				};
		
		System.out.println(table3[1][1]);
	}
}
