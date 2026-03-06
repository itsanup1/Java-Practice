import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a day of the week: ");
		String day = sc.nextLine();
		
		switch(day){
		    case "Monday":
		        System.out.println("Its a weekday 😭");
		        break;
		    case "Tuesday":
		        System.out.println("Its a weekday 😭");
		        break;
		    case "Wednesday":
		        System.out.println("Its a weekday 😭");
		        break;
		    case "Thursday" :
		        System.out.println("Its a weekday 😭");
		        break;
		    case "Friday" :
		        System.out.println("Its a weekday 😭");
		        break;
		    
		    case "Saturday" :
		        System.out.println("Its a weekend 🥳");
		        break;
		    case "Sunday" :
		        System.out.println("Its a weekend 🥳");
		        break;
		        
		    default:
		        System.out.println(day + " is not a valid day");
		}
	}
}