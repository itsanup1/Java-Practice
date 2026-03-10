import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int rows;
		int columns;
		char symbol;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number of Rows: ");
		rows = sc.nextInt();
		
		System.out.print("Enter The Njmber of Columns: ");
		columns = sc.nextInt();
		
		System.out.print("Enter The Symbol: ");
		symbol = sc.next().charAt(0);
		
		for(int i =0; i<rows; i++){
		    for(int j = 0; j<columns; j++){
		        System.out.print(symbol);
		    }
		    System.out.println();
		}
	}
}