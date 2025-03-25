import java.util.Scanner;

public class Level1q8{
	
	public static void CreateException(String names[]){
		
		System.out.println(names[Integer.MAX_VALUE]);
		
	}
	public static void HandleException(String names[]){
		try{
			System.out.println(names[Integer.MAX_VALUE]);

		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("caught ArrayIndexOutOfBoundsException: "+ e.getMessage());
		}catch(RuntimeException e){
			System.out.println("caught RuntimeException: "+ e.getMessage());
		}
		
		
		
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		int count;
		System.out.println("Enter number of Students");
		count=scanner.nextInt();
		scanner.nextLine();
		String[] names=new String[count];
		System.out.println("Enter the names of the students: ");
		for(int i=0;i<count;i++){
			
			names[i]=scanner.nextLine();
		}
		
		//CreateException(names);
		HandleException(names);

		
	}
	
}