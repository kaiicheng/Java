
public class StaticVariable2 {

    static int a;
    int b;
	
	public static void main(String[] args) {

		// static variable obj1.a and obj2.a point to the same chunk of memory,
		// so the modification of obj1.a will affect obj2.a
		StaticVariable2 obj1 = new StaticVariable2();
        obj1.a = 100;
        obj1.b = 101;
        System.out.println("obj1.a = " + obj1.a + ", obj1.b = " + obj1.b);
        
		// instance variable obj1.b and obj2.b point to the different chunk of memory,
        // modification of obj1.b won't affect obj2.b
        StaticVariable2 obj2 = new StaticVariable2();
        System.out.println("obj2.a = " + obj2.a + ", obj2.b = " + obj2.b);
		
	}
}
