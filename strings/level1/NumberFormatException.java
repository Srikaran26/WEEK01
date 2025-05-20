import java.util.Scanner;

public class NumberFormatException {
	
	public static void generateException(String text){
		int num=Integer.parseInt(text);
		System.out.println(num);
	}
	
	
	public static void HandleException(String text){
		
		try{
			int num=Integer.parseInt(text);
			System.out.println(num);
		}catch(java.lang.NumberFormatException e){
			
			System.out.println("caught NumberFormatException: "+ e.getMessage());
			
			
		}
		
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		
		//generateException(text);
		
		HandleException(text);
		
	}
}