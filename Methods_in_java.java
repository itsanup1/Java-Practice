public class Main {
	
	public static void main(String[] args) {
		
		String name = "Spongebob";
		int age = 16;
		happyBirthday(name,age);
		
	}
	
	//User defined method
	static void happyBirthday(String name, int age){
	    System.out.println("Happy Birthday to you!");
	    System.out.printf("Happy Birthday dear %s!\n",name);
	    System.out.printf("You are %d years old!\n",age);
	    System.out.println("Happy Birthday to you!");
	}
	
}