import java.util.Arrays;

public class ArrayOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// table of 3 rows and 2 columns
		int [][] table = new int[3][2];
	 
		int count = 1;
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j <table[i].length; j++) {
				table[i][j] = count++;
			}
		}
		
		int [][] table2 = {
				{1, 2}, 
				{3, 4},
				{5, 6}
		};
		
		System.out.println(Arrays.deepEquals(table, table2));
	}
}
