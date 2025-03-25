public class Level3q3 {
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return Math.abs(number) % sum == 0;
    }
    public static int[][] findDigitFrequencies(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequencies = new int[10][2]; // Initialize with zeros
        for (int digit : digits) {
            frequencies[digit][0] = digit; // Store the digit
            frequencies[digit][1]++; // Increment frequency
        }
        int count = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][1] > 0) {
                count++;
            }
        }
        int[][] filteredFrequencies = new int[count][2];
        int index = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i][1] > 0) {
                filteredFrequencies[index][0] = frequencies[i][0];
                filteredFrequencies[index][1] = frequencies[i][1];
                index++;
            }
        }
        return filteredFrequencies;
    }
    public static void main(String[] args) {
        int[] testNumbers = {153, 1634};
        for (int number : testNumbers) {
            System.out.println("\nAnalyzing number: " + number);
            int digitCount = countDigits(number);
            System.out.println("Number of digits: " + digitCount);
            int[] digits = getDigitsArray(number);
            System.out.print("Digits: ");
            for (int digit : digits) {
                System.out.print(digit + " ");
            }
            System.out.println();
            int sum = sumOfDigits(number);
            System.out.println("Sum of digits: " + sum);
            double sumOfSquares = sumOfSquaresOfDigits(number);
            System.out.println("Sum of squares of digits: " + sumOfSquares);
            boolean isHarshad = isHarshadNumber(number);
            System.out.println("Is Harshad number: " + isHarshad);
            int[][] frequencies = findDigitFrequencies(number);
            System.out.println("Digit Frequencies:");
            for (int[] frequency : frequencies) {
                System.out.println(frequency[0] + ": " + frequency[1]);
            }
            System.out.println("----------------------------------------");
        }
    }
}
