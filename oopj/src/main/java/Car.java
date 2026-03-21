public class Car {
	
	String model = "Mustang";
	String make = "Ford";
	int year = 2019;
	int price = 100000000;
	boolean isrunning = false;
	
	void start(){
		System.out.println("You Start The Engine");
		isrunning = true;
	}
	void stop(){
		System.out.println("You Stop The Engine");
		isrunning = false;
	}
	void drive(){
		System.out.println("You drive the "+ model);
	}
	void brake(){
		System.out.println("You brake the "+ model);
	}
}