package day2.level1;


import java.util.Scanner;

public class Spring7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month name");
        String month = scanner.nextLine();
        System.out.println("Enter date");
        int date = scanner.nextInt();

        if (isSpring(month, date)) {
            System.out.println("It's a spring season");
        } else {
            System.out.println("It's not a spring season");
        }
    }

    private static boolean isSpring(String month, int date) {
        String Lowermonth = month.toLowerCase();
        if (date < 1 || date > 31) {
            return false;
        }
        switch (Lowermonth) {
            case "march":
                return date >= 20;
            case "may":
                return true;
            case "april":
                return true;
            case "june":
                return date <= 20;
            default:
                return false;
        }
    }
}




