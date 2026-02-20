import java.util.Scanner;

public class Compound_Interest{
    public static void main(String[] args){
        double principle;
        double rate;
        double time;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The principle amount: ");
        principle = sc.nextDouble();
        System.out.print("Enter The Interest rate(in %): ");
        rate = sc.nextDouble();
        System.out.print("Enter The Time (In years): ");
        time = sc.nextDouble();
    }
}