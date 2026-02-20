import java.util.Random;

public class Coin_Flip {
	public static void main(String[] args) {
		Random random = new Random();
		boolean coin = random.nextBoolean();
		if(coin){
		    System.out.println("Head");
		}else{
		    System.out.println("Tail");
		}
		
	}
}