import java.util.Scanner;

public class Level1q6{
	
	public static boolean Spring(String monthLower,int date ){
		switch(monthLower){
			case "march":
				if(date>=20){
					return true;
				}else{
					return false;
				}
			case "april":
				return true;
			case "may":
				return true;
			case "june":
				if(date<=20){
					return true;
				}else{
					return false;
				}
			default:
				return false;
		}
		
	}
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month: ");
		String month=scanner.nextLine();
		System.out.println("Enter Date: ");
		int date=scanner.nextInt();
		scanner.close();
		String monthLower=month.toLowerCase();
		boolean result=Spring(monthLower,date);
		if(result==true){
			System.out.println("Spring Season");
		}else{
			System.out.println("Not a Spring Season");
		}
		
	}
	
}