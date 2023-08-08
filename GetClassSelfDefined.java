
public class GetClassSelfDefined {

	public static void main(String[] args) {

        // create Person object
        Person obj = new Person(1, "Alice");
        
        // Person inherits Object
        // call .getClass()
        System.out.println(obj.getClass());
    }
}

class Person{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}