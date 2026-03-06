import  java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		char operator;
		double result = 0;
		boolean validOperation = true;
		
		
		System.out.print("Enter First Number: ");
		num1 = sc.nextDouble();
		
		System.out.print("Enter Operation To Perform( + , - , * , / , ^ ): ");
		operator = sc.next().charAt(0);
		
		System.out.print("Enter Second Number: ");
		num2 = sc.nextDouble();
		
		
		
		switch(operator){
		    case '+':
		        result = num1 + num2;
		        break;
		    case '-':
		        result = num1 - num2;
		        break;
		    case '*':
		        result = num1 * num2;
		        break;
		    case '/':
		        if(num2 == 0){
		            System.out.println("Can't Devide by ZERO");
		            validOperation = false;
		        }else{
		            result = num1 / num2;
		        }
		        break;
		        
		    case '^':
		        result = Math.pow(num1,num2);
		        break;
		    default:
		        System.out.println("Invalid Operation!");
		        validOperation = false;
		}
		
		
		if(validOperation){
		    System.out.println(result);
		}else{
		    return;
		}
		
		sc.close();
	}
}