import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		
		if(((year % 4 ==0) && (year % 100 != 0))|| (year%400 == 0)){
		    System.out.println("The Year is A Leap Year");
		}else{
		    System.out.println("The Year is not A Leap Year");
		}
		
		
		scanner.close();
	}
}