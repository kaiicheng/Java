
public class SystemOut {

	public static void main(String[] args) {
		
        // println() automatically add \r\n at the end
        System.out.println("Hello World!!");
        
        // print() won't move to the next line
        System.out.print("This is a test!");
        System.out.print(" Followed by this. ");
        System.out.println("");
        
        int a = 456;
        System.out.print("Number: ");
        System.out.println(a);
        
        float b = 234.12f;
        System.out.print("Float: ");
        System.out.println(b);
        
        double c = 987.1;
        System.out.print("Double: ");
        System.out.println(c);
        
        char d = 'a';
        System.out.print("Char: ");
        System.out.println(d);
        
        String e = "abcDEF";
        System.out.print("String: ");
        System.out.println(e);
        
        Object f = new Object();
        System.out.print("Object: ");
        System.out.println(f);
        
        System.out.print("Object toString: ");
        System.out.println(f.toString());
        
	}
}
