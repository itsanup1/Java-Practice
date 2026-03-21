public class Main {
	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car();
		
		//System.out.println(car.model);
//		System.out.println(car.year);
//		System.out.println(car.price);
//		System.out.println(car.isrunning); 
//		car.start();
//		System.out.println(car.isrunning);
//		car.stop();
//		System.out.println(car.isrunning);
		car.drive();
		car2.drive();
		
		car.brake();
		car2.brake();
	}
}