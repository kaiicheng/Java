/*
 * Another common usage is to use static variables to share data across instances of an object,
 * e.g. to keep track of the object instances created
 */
import java.util.ArrayList;

public class StaticVariableCar {

	// list of all created cars
	static ArrayList<StaticVariableCar> CAR_LIST = new ArrayList<StaticVariableCar>();
	
	public StaticVariableCar() {
		StaticVariableCar.CAR_LIST.add(this); // create car and add to list
	}
	
	public static void main(String[] args) {
		StaticVariableCar car1 = new StaticVariableCar();
		StaticVariableCar car2 = new StaticVariableCar();
		for (StaticVariableCar car: StaticVariableCar.CAR_LIST) {
			System.out.println(car);
		}
	}
}
