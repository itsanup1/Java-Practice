import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.print("Enter The radius of the circle: ");
        radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2*Math.PI*radius;
        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
    }
}