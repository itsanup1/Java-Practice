public class Main {
	public static void main(String[] args) {
		
		String[] fruits = {"apple","orange","banana","pineapple"};
		String[] vegetables = {"tomato","cucomber","carrot","raddish"};
		String[] meats = {"pork","beef","mutton","fish"};
		
		String[][] foods = {fruits,vegetables,meats};
		
		foods[0][2] ="chickoo"; //2d array indexing
		
		for(String[] food: foods){
			for(String i: food){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}