import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int min = 1;
		int max = 100;
		int guess;
		int num;
		int attempts = 1;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
	    num = random.nextInt(max)+min;
		System.out.printf("Guess The Number Between %d - %d\n", min,max);
		System.out.println("");
		
		do{
    		System.out.print("Enter the number: ");
    		guess = scanner.nextInt();
    		
    		if(guess<num){
    		    System.out.println("Too Small, Try Again!\n");
    		    attempts += 1;
    		}else if(guess>num){
    		    System.out.println("Too Big, Try Again!\n");
    		    attempts += 1;
    		}else{
    		    System.out.println("\nYou Guessed Correct, YOU WON!");
    		    System.out.println("Attemps: "+attempts);
    		}
		}while(!(guess == num));
    
		
		
		
		scanner.close();
	}
}