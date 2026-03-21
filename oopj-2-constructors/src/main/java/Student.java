public class Student {
	String name;
	int age;
	double gpa;
	boolean isEnrolled;
	
	//This is a constructor
	Student(String name, int age, double gpa){
		
		//The var present with this keyword is the var outside the constructor. and the other one is the attribute of constructor
		
		//Imagine it like when we make an object like student1 we replace this with student1
		
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.isEnrolled  = true; //when you become student you are enrolled
	}
	
	void study(){
		System.out.println(this.name + " is studying!");
	}
}