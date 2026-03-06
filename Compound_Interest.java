import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        double principle;
        double rate;
        double time;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The principle amount: ");
        principle = sc.nextDouble();

        System.out.print("Enter The Interest rate (in %): ");
        rate = sc.nextDouble();
        rate = rate / 100;   // Convert % to decimal

        System.out.print("Enter The Time (In years): ");
        time = sc.nextDouble();

        System.out.print("Enter The Number of times the interest will be charged per year: ");
        n = sc.nextInt();

        double amount = principle * Math.pow((1 + rate / n), n * time);

        System.out.printf("Final Amount: %.2f",amount);

        sc.close();
    }
}