public class Field {
	public static void main(String[] args) {

		class Animal {
		    int age;
		    int weight;
		     
		    void speak() {
		        System.out.println("Hello, I'm " + age + " old and I'm " + weight + " kg.");
		    }
		}
		 
		class Elephant extends Animal {
		    String name;
		     
		    @Override
			void speak() {
		        System.out.println("My name is " + name + " and I'm " + age + " old.");
		    }
		 
		}
		
        Animal puppy1 = new Animal();
        puppy1.age = 12;
        puppy1.weight = 25;
        puppy1.speak();
         
        Elephant puppy2 = new Elephant();
        puppy2.age = 8;
        puppy2.weight = 1200;
        puppy2.name = "Elephant";
        puppy2.speak();
        
        Elephant puppy3 = new Elephant();
        puppy3.age = 10;
        puppy3.weight = 1000;
        puppy3.name = "Giraffe";
        puppy3.speak();
		
	}

}
