import java.util.Random;
public class Level3q11 {
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] employeeData = new int[10][2];
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000; 
            employeeData[i][1] = random.nextInt(11);
        }
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[10][2]; 
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02; 
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
            updatedData[i][0] = bonusAmount;
            updatedData[i][1] = newSalary;
        }
        return updatedData;
    }
    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusAmount = 0;
        System.out.println("Employee Data:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15s %-15s %-15s\n", "ID", "Years", "Old Salary", "Bonus Amount", "New Salary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < employeeData.length; i++) {
            int yearsOfService = employeeData[i][1];
            int oldSalary = employeeData[i][0];
            double bonusAmount = updatedData[i][0];
            double newSalary = updatedData[i][1];
            totalOldSalary += oldSalary;
            totalBonusAmount += bonusAmount;
            totalNewSalary += newSalary;
            System.out.printf("%-5d %-10d %-15.2f %-15.2f %-15.2f\n",
                    (i + 1), yearsOfService, (double) oldSalary, bonusAmount, newSalary);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15.2f %-15.2f %-15.2f\n", "Total", "", totalOldSalary, totalBonusAmount, totalNewSalary);
    }
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
}
