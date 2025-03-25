import java.util.Scanner;

public class Level3q12 {

    public static double[][] calculateStatistics(int[][] scores) {
        double[][] statistics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (total / 300.0) * 100;

            statistics[i][0] = (double) Math.round(total * 100.0) / 100.0;
            statistics[i][1] = Math.round(average * 100.0) / 100.0;
            statistics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return statistics;
    }

    public static String assignGrade(double percentage) {
        if (percentage >= 80) {
            return "A - Level4, above agency normalized standards";
        } else if (percentage >= 70 && percentage < 80) {
            return "B - Level3, at agency normalized standards";
        } else if (percentage >= 60 && percentage < 70) {
            return "C - Level2, below but approaching agency normalized standards";
        } else if (percentage >= 50 && percentage < 60) {
            return "D - Level1, well below agency normalized standards";
        } else if (percentage >= 40 && percentage < 50) {
            return "E - Level1, too below agency normalized standards";
        } else {
            return "R - Remedial Students";
        }
    }

    public static void displayScorecard(int[][] scores, double[][] statistics) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print(statistics[i][0] + "\t" + statistics[i][1] + "\t" + statistics[i][2] + "\t");
            System.out.println(assignGrade(statistics[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1));
            System.out.print("Physics: ");
            scores[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            scores[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            scores[i][2] = scanner.nextInt();
        }

        double[][] statistics = calculateStatistics(scores);

        displayScorecard(scores, statistics);

        scanner.close();
    }
}
