import java.util.Random;
public class Level3q1 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random height between 150 and 250
        }
        int sumOfHeights = calculateSumOfHeights(heights);
        double meanHeight = calculateMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        System.out.println("Heights of Players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        System.out.println("Sum of Heights: " + sumOfHeights);
        System.out.println("Mean Height: " + meanHeight);
        System.out.println("Shortest Height: " + shortestHeight);
        System.out.println("Tallest Height: " + tallestHeight);
    }
    public static int calculateSumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double calculateMeanHeight(int[] heights) {
        return (double) calculateSumOfHeights(heights) / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
