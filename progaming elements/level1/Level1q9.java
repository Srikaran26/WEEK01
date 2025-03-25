import java.util.Scanner;

public class Level1q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discountedFee);
        scanner.close();
    }
}