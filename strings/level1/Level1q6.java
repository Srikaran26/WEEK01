import java.util.Scanner;


public class Level1q6{
	
	public static void generateException(String text){
		System.out.println(text.substring(7,5));
		
	}
	
	public static void HandleException(String text){
		try{
			System.out.println(text.charAt(15));
		} catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
			
		}catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		}
		catch (RuntimeException e) { 
		System.out.println("Caught RuntimeException: " + e.getMessage());
		}
		 
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		generateException(text)
		HandleException(text);
	}
}