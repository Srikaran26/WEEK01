public class Level3q2 {
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
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        if (digits.length > 0 && digits[0] == 0) {
            return false;
        }
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }
    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = getDigitsArray(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = getDigitsArray(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
        int[] testNumbers = {153, 1634,};
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
            boolean isDuck = isDuckNumber(number);
            System.out.println("Is duck number: " + isDuck);
            boolean isArmstrong = isArmstrongNumber(number);
            System.out.println("Is Armstrong number: " + isArmstrong);
            int[] largestPair = findLargestAndSecondLargest(number);
            System.out.println("Largest digit: " + largestPair[0]);
            System.out.println("Second largest digit: " + (largestPair[1] == Integer.MIN_VALUE ? "N/A" : largestPair[1]));
            int[] smallestPair = findSmallestAndSecondSmallest(number);
            System.out.println("Smallest digit: " + smallestPair[0]);
            System.out.println("Second smallest digit: " + (smallestPair[1] == Integer.MAX_VALUE ? "N/A" : smallestPair[1]));
            System.out.println("----------------------------------------");
        }
    }
}
