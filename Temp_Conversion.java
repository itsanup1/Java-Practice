import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		double temp;
		double newTemp;
		String unit;
		
		System.out.print("Enter the Temp: ");
		temp = sc.nextDouble();
		
		System.out.print("Do you want to convert to Fahrenheit or Celsius(F or C): ");
		unit = sc.next().toUpperCase();
		
		newTemp = (unit.equals("F")) ? (temp*9/5) + 32 : (temp - 32) * 5/9;
		
		System.out.printf( "%.2f °%s",newTemp, unit);
		
		sc.close();
	}
}