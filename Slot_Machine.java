import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int balance = 100;
		int bet;
		int payout;
		String[] row ;
		
		
		
		System.out.println("*********************************");
		System.out.println("   Welcome to The Slot Machine   ");
		System.out.println("*********************************");
		
		while(balance>0){
			System.out.println("Current balnce: $"+balance);
			System.out.print("Enter Your Bet: $");
			bet = sc.nextInt();
			sc.nextLine();
			
			if(bet>balance){
				System.out.println("Balance Insufficient");
				continue;
			}else if(bet<=0){
				System.out.println("Bet must be greater than zero!");
				continue;
			}else{
				balance -= bet;
			}
			System.out.println("Spinning ...");
			row = spinrow();
			printrow(row);
			payout=getPayout(row,bet);
			if(payout>0){
				System.out.println("You Win $"+payout);
				balance += payout;
			}else{
				System.out.println("You Lose!");
			}
		}
		
		sc.close();
	}
	
	static String[] spinrow(){
		
		String[] symbols = {"🍒","🍉","🍋","🔔","⭐"};
		String[] row = new String[3];
		
		Random random = new Random();
		
		
		for(int i=0; i<3;i++){
			row[i] = symbols[random.nextInt(symbols.length)];
		}
		
		
		return row;
	}
	
	static void printrow(String[] row){
		System.out.println("\n**************"); 
		System.out.println(" " +String.join(" | ",row));
		System.out.println("**************\n");
	}
	
	static int getPayout(String[] row, int bet){

	    if(row[0].equals(row[1]) && row[1].equals(row[2])){
	
	        switch(row[0]){
	            case "🍒":
	                return bet * 3;
	
	            case "🍉":
	                return bet * 4;
	
	            case "🍋":
	                return bet * 5;
	
	            case "🔔":
	                return bet * 10;
	
	            case "⭐":
	                return bet * 20;
	
                default:
                return 0;
       	 }
  	  }else if(row[0].equals(row[1])){
	
	        switch(row[0]){
	            case "🍒":
	                return bet * 2;
	
	            case "🍉":
	                return bet * 3;
	
	            case "🍋":
	                return bet * 4;
	
	            case "🔔":
	                return bet * 5;
	
	            case "⭐":
	                return bet * 10;
	
                default:
                return 0;
       	 }
  	  }else if(row[1].equals(row[2])){
	
	        switch(row[1]){
	            case "🍒":
	                return bet * 2;
	
	            case "🍉":
	                return bet * 3;
	
	            case "🍋":
	                return bet * 4;
	
	            case "🔔":
	                return bet * 5;
	
	            case "⭐":
	                return bet * 10;
	
                default:
                return 0;
       	 }
  	  }else if(row[0].equals(row[2])){
	
	        switch(row[0]){
	            case "🍒":
	                return bet * 2;
	
	            case "🍉":
	                return bet * 3;
	
	            case "🍋":
	                return bet * 4;
	
	            case "🔔":
	                return bet * 5;
	
	            case "⭐":
	                return bet * 10;
	
                default:
                return 0;
       	 }
  	  }
 	   return 0;
	}
}