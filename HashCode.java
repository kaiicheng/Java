
public class HashCode {

	public static void main(String[] args) {

		String Str = new String("123456");
        System.out.println(Str.hashCode() );

        String Str2 = new String("234567");
        System.out.println(Str2.hashCode() );

        String Str3 = new String("123456");
        System.out.println(Str3.hashCode() );

        String Str4 = new String("aba");
        System.out.println(Str4.hashCode() );
        
        String Str5 = new String("aba");
        System.out.println(Str5.hashCode() );
	
	}
}
