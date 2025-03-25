public class Level3q6 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum == number;
    }
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == Math.abs(number);
    }
    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] testNumbers = {6, 12};
        for (int number : testNumbers) {
            System.out.println("\nAnalyzing number: " + number);
            int[] factors = findFactors(number);
            System.out.print("Factors: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
            int greatestFactor = findGreatestFactor(number);
            System.out.println("Greatest factor: " + greatestFactor);
            int sumOfFactors = sumOfFactors(number);
            System.out.println("Sum of factors: " + sumOfFactors);
            long productOfFactors = productOfFactors(number);
            System.out.println("Product of factors: " + productOfFactors);
            double productOfCubeOfFactors = productOfCubeOfFactors(number);
            System.out.println("Product of cube of factors: " + productOfCubeOfFactors);
            boolean isPerfect = isPerfectNumber(number);
            System.out.println("Is perfect number: " + isPerfect);
            boolean isAbundant = isAbundantNumber(number);
            System.out.println("Is abundant number: " + isAbundant);
            boolean isDeficient = isDeficientNumber(number);
            System.out.println("Is deficient number: " + isDeficient);
            boolean isStrong = isStrongNumber(number);
            System.out.println("Is strong number: " + isStrong);
            System.out.println("----------------------------------------");
        }
    }
}
