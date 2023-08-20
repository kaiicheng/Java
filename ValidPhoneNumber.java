
public class ValidPhoneNumber {
	public static void main(String[] args) {
	    
		// random phone number
	    String tel = "1234567891011";
	    int len = tel.length();
	    
	    if(len!=11) System.out.println("Invid length!");
	    
	    for(int i= 0; i < len; i++){
	    	
	    	System.out.println(i);
	    	
	        // get every digit
	        char cur = tel.charAt(i);
	        
	        if(cur <= '0' || cur >= '9'){
	            System.out.println("Invalid input!");
	            break;
	        }
	    }
	    
	    String tel2 = "12345678910";
	    System.out.println(tel2.matches("\\d{11}"));
	}
}
