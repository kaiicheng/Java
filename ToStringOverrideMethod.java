/**
 * This program is used to show the use of override toString method.
 * @author kai
 */

public class ToStringOverrideMethod {

	static class Student{
		
		String name;
		String rollNo;
	 
		//constructor
		public Student(String name, String rollNo){
			this.name = name;
			this.rollNo = rollNo;
		}
	 
		//Override toString method to get customize results.
//		@Override
		public String toString(){
			return "Name:" + name + ", RollNo: " + rollNo;
		}
	}

	public static void main(String[] args) {
		
		//creating Student class object
		Student stu1 = new Student("Sunil", "MCA/07/15");
		Student stu2 = new Student("Sandy", "MCA/07/19");
		Student stu3 = new Student("Roxy", "MCA/07/32");
 
		//println internally call toString method
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
