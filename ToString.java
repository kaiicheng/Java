/**
 * This program is used to show the use of toString method.
 * @author kai
 */

//public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

class Student{
		String name;
		String rollNo;
	 
		//constructor
		Student(String name, String rollNo){
			this.name = name;
			this.rollNo = rollNo;
		}
	}

public class ToString {	
	public static void main(String[] args) {
		//creating Student class object
		Student stu1 = new Student("Sunil", "MCA/07/15");
		Student stu2 = new Student("Sandy", "MCA/07/19");
		Student stu3 = new Student("Roxy", "MCA/07/32");
 
		//println internally call toString method
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		// print out class name (Student) + @ + hexadecimal hashcode (4517d9a3)
		//Student@4517d9a3
		//Student@372f7a8d
		//Student@2f92e0f4	
	}
}
