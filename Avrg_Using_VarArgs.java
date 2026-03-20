public class Main {
	public static void main(String[] args) {
		System.out.println(avrg());
	}
	static double avrg(double ...numbers){
		
		double sum = 0;
		if(numbers.length == 0){
			return 0;
		}
		for(double number : numbers){
			sum += number;
		}
		
		return sum/numbers.length;
	}
}