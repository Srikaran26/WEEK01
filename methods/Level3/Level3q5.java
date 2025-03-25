public class Level3q5 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(square);
        return sumOfDigits == number;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphicNumber(int number) {
        long square = (long) number * number; 
        String squareStr = Long.toString(square);
        String numberStr = Integer.toString(number);
        return squareStr.endsWith(numberStr);
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        int[] testNumbers = {2, 9, 13};
        for (int number : testNumbers) {
            System.out.println("\nAnalyzing number: " + number);
            boolean isPrime = isPrime(number);
            System.out.println("Is prime: " + isPrime);
            boolean isNeon = isNeonNumber(number);
            System.out.println("Is neon number: " + isNeon);
            boolean isSpy = isSpyNumber(number);
            System.out.println("Is spy number: " + isSpy);
            boolean isAutomorphic = isAutomorphicNumber(number);
            System.out.println("Is automorphic number: " + isAutomorphic);
            boolean isBuzz = isBuzzNumber(number);
            System.out.println("Is buzz number: " + isBuzz);
            System.out.println("----------------------------------------");
        }
    }
}
