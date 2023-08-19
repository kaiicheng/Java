
public class Split {
	public static void main(String[] args) {
		String str = new String("Welcome-to-the-world!");
		 
        System.out.println("Spliting with '-':" );
        for (String retval: str.split("-")){
            System.out.println(retval);
        }
        System.out.println("");
        
        System.out.println("Spliting with '-' and returning 0 piece: ");
        for (String retval: str.split("-", 0)){
            System.out.println(retval);
        }
        System.out.println("");
        
        System.out.println("Spliting with '-' and returning 2 pieces: ");
        for (String retval: str.split("-", 2)){
            System.out.println(retval);
        }
        System.out.println("");
        
        System.out.println("Spliting with '-' and returning 3 pieces: ");
        for (String retval: str.split("-", 3)){
            System.out.println(retval);
        }
        System.out.println("");
        
        String str2 = new String("www.helloworld.com");
        System.out.println("Spliting with '.':" );
        for (String retval: str2.split("\\.", 3)){
            System.out.println(retval);
        }
        System.out.println("");
        
        String str3 = new String("acount=? and uu =? or n=?");
        System.out.println("Returning multiple key words:" );
        for (String retval: str3.split("and|or")){
            System.out.println(retval);
        }
	}
}
