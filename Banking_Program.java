import java.util.Scanner;

public class Banking_Program{
public static void main(String[] args) {

        double Balance = 2000;
        boolean isrunning = true;
        Scanner sc = new Scanner(System.in);

        while(isrunning){
            System.out.println("-------------------");
            System.out.println("Banking Program");
            System.out.println("-------------------");
    
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
    
            System.out.println("-------------------");
    
            System.out.print("Enter Your Choice (1-4): ");
            int choice = sc.nextInt();
            System.out.println("-------------------");
    
            switch (choice) {
                case 1:
                    System.out.printf("Balance: $%.2f\n", Balance);
                    break;
                case 2:
                    System.out.print("Enter The Amount To Deposit: $");
                    double Deposit= sc.nextDouble();
                    if (Deposit<=0){
                        System.out.println("Enter a valid amount and TRY AGAIN!");
                    }else{

                        Balance += Deposit;
                        System.out.println("Amount Sucessfully Deposited!");
                    }
                    break;
                case 3:
                    System.out.print("Enter The Amount To Withdraw: $");
                    double WithdrawAmt= sc.nextDouble();
                    if(WithdrawAmt<=0 || WithdrawAmt>Balance){
                        System.out.println("Enter a valid amount and TRY AGAIN!");
                    }else{
                        Balance -= WithdrawAmt;
                        System.out.println("Amount Sucessfully Withdrawn!");
                    }
                    
                    break;
                case 4:
                    System.out.println("Program Exited Successfully");
                    isrunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        }
        sc.close();
    }
}