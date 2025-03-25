import java.util.Scanner;

public class Level1q7{
	
	public static void generateException(String text){
		int num=Integer.parseInt(text);
		System.out.println(num);
	}
	
	
	public static void HandleException(String text){
		
		try{
			int num=Integer.parseInt(text);
			System.out.println(num);
		}catch(NumberFormatException e){
			
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