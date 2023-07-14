
public class CreateArrayInOneLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] primes = {2, 3, 5};
		
		String[] languages = {"Java", "C", "C++"};
		
		// Customer[] customers = {new Customer("Brandon"), new Customer("Besty"), new Customer("Alan")};

        for(int i=0;i<3;i++){
            System.out.println(primes[i]);
            System.out.println(languages[i]);
            // System.out.println(customers[i]);            
        }

        // illegal declaration
        // int[] composites;
        // composites = {4, 6, 8, 9};
		
	}

}
