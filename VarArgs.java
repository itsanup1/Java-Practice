public class Main {
	public static void main(String[] args) {
		int result = add(1,2,3,4,5,6,7,8,9,10);
			
		System.out.print(result);
	}
	static int add(int... numbers){
		int sum = 0;
		for(int num : numbers){
			sum += num;
		}
		return sum;
	}
}