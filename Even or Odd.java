import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num1 = scanner.nextInt();
		
		if (num1%2 == 0){
		    System.out.println("The Number is Even.");
		}else{
		    System.out.println("The Number is Odd.");
		}
		
		scanner.close();
	}
}