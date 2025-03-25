import java.util.Scanner;

public class Level1q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in centimeters: ");
        double baseCm = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in centimeters: ");
        double heightCm = scanner.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / 6.4516; 
        System.out.println("The area of the triangle is:");
        System.out.println("In square centimeters: " + areaCm2);
        System.out.println("In square inches: " + areaInches2);
        scanner.close();
    }
}