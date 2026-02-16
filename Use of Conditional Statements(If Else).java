import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Enter Your Name: ");
		name= sc.nextLine();
		
		System.out.print("Enter Your Age: ");
		age = sc.nextInt();
		
		System.out.println("Hello, "+ name);
		if(age>=18){
		    System.out.println("You're Eligible To Vote!");
		}else{
		    System.out.println("You're Not Eligible To Vote!");
		}
		
		sc.close();
	}
}