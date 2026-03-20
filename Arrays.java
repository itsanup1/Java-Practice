import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		String[] fruits = {"Apple","Orange","Banana","Pineapple"};
		int noOfFruits = fruits.length;
		System.out.println(fruits[3]+"\n");
		
		for (int i = 0; i<noOfFruits; i++){
		    System.out.println(fruits[i]);
		}
		
		System.out.println("\nAfter Sorting:\n");
		
		Arrays.sort(fruits);
		
		for (int i = 0; i<noOfFruits; i++){
		    System.out.println(fruits[i]);
		}
		
		System.out.println("\nAfter Using Fill\n");
		Arrays.fill(fruits,"Coconut");
		for (int i = 0; i<noOfFruits; i++){
		    System.out.println(fruits[i]);
		}
	}
}