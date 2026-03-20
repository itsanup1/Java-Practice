import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] foods ;
		System.out.print("Enter No. of Items: ");
		int size = sc.nextInt();
		sc.nextLine();//For The bug that occurs ask chatgpt
		foods = new String[size];
		
		for(int i = 0; i<size; i++){
		    System.out.print("Enter Food: ");
		    foods[i] = sc.nextLine();
		}
		
		for(int i = 0; i<size; i++){
		    System.out.println(foods[i]);
		}
	}
}