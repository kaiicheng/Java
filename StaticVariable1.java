
public class StaticVariable1 {

    static int a = 1;
    int b = 2;
    
    public static void main(String[] args) {
    	
        System.out.println("Static variable a = " + StaticVariable1.a);
        // error:
        // Cannot make a static reference to the non-static field StaticVariable1.b
//        System.out.println("Instance variable b= " + StaticVariable1.b);  
        
        // create a class (Object)
        StaticVariable1 obj = new StaticVariable1();
        System.out.println("Instance variable b = " + obj.b);
    }
}
