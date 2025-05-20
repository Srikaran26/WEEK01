import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void generateException(String text) {
		try {
			System.out.println(text.substring(7, 5)); // Will throw StringIndexOutOfBoundsException
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Caught RuntimeException: " + e.getMessage());
		}
	}

	public static void HandleException(String text) {
		try {
			System.out.println(text.charAt(15)); // May throw StringIndexOutOfBoundsException
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Caught RuntimeException: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		generateException(text);
		HandleException(text);
	}
}
