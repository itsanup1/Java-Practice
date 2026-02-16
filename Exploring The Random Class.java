import java.util.Random;
public class Main {
	public static void main(String[] args) {
		
		//Generates a large random Integer
		Random rand = new Random();
		
		int num1 = rand.nextInt();
		System.out.println(num1);
		
		
		//For a random integer within a range
		int num2= rand.nextInt(6)+1;
		//This will generate the number from 1-6 it wont include 7
		System.out.println(num2);
		
		//To generate a random double
		double num3 = rand.nextDouble();
		System.out.println(num3);
		
		
		//To generate a random Boolean Value
		boolean num4 = rand.nextBoolean();
		System.out.println(num4);
		
	}
}