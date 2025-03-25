public class Level3q4 {
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
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] testNumbers = {153,0};
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
            int[] reversed = reverseDigitsArray(digits);
            System.out.print("Reversed Digits: ");
            for (int digit : reversed) {
                System.out.print(digit + " ");
            }
            System.out.println();
            boolean areEqual = compareArrays(digits, reversed);
            System.out.println("Are original and reversed arrays equal? " + areEqual);
            boolean isPalindrome = isPalindrome(number);
            System.out.println("Is palindrome: " + isPalindrome);
            boolean isDuck = isDuckNumber(number);
            System.out.println("Is duck number: " + isDuck);
            System.out.println("----------------------------------------");
        }
    }
}
