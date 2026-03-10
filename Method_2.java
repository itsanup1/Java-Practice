import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		num = sc.nextDouble();
		
		double result = square(num);
		System.out.printf("%.2f\n",result);
		
		result = cube(num);
		System.out.printf("%.2f\n",result);
	}
	
	static double square(double num){ return num * num; }
	
	static double cube(double num){ return num * num*num; }
	
}