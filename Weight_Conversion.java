import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Weight Conversion Program");
		System.out.println("1.Convert kgs to lbs");
		System.out.println("2.Convert lbs to kgs");
		
		System.out.print("Choose an option: ");
		int userChoice = sc.nextInt();
		
		if(userChoice == 1){
		    System.out.print("\nEnter the weight in kgs: ");
		    double weight = sc.nextDouble();
		    double newWeight = weight * 2.20462;
		    
		    System.out.printf("The new weight in lbs: %.2f",newWeight);
		    
		}else if(userChoice == 2){
		    
		    System.out.print("\nEnter the weight in lbs: ");
		    double weight = sc.nextDouble();
		    double newWeight = weight * 0.453592;
		    
		    System.out.printf("The new weight in kgs: %.2f",newWeight);
		    
		}else{
		    
		    System.out.println("Invalid Choice!");
		}
	}
}