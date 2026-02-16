import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		System.out.println("Hello, "+name);
		System.out.println("You are "+ age+ " Years old");
		
		scanner.close();
	}
}