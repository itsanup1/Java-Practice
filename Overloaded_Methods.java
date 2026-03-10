public class Main {
	public static void main(String[] args) {
		double n1 = 2;
		double n2 = 4;
		double n3 = 8;
		
		double result1 = add(n1,n2,n3);
		double result2 = add(n1,n2);
		
		System.out.print(result1+"\n"+result2);
	}
	
	static double add(double n1, double n2, double n3){
	    return n1 + n2 + n3;
	}
	static double add(double n1, double n2){
	    return n1 + n2 ;
	}
}