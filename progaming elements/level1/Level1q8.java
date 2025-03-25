import java.util.Scanner;
public class Level1q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        double conversionFactor = 1.0 / 1.6;
        double miles = km * conversionFactor;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}