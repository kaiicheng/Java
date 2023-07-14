
public class CreatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x;
		x = new int[5];
		
		//equal to:
		//int[] x = new int[5];
		
		x[0] = 80;
		x[1] = 60;
		x[2] = 100;
		x[3] = 80;
		x[4] = 90;
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//x[5] = 85;
		
		//print out location of memory
		System.out.println(x);
		
        for(int i=0;i<5;i++){
            System.out.println(x[i]);
        }

	}
}
