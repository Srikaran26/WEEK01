import java.util.Scanner;

public class Leapyr1{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=scanner.nextInt();
		if(year<=1582){
			System.out.println("Enter the year above 1581");
			
		}
		else{
			if(year%4==0){
				if(year%100==0){
					if(year&400==0){
						System.out.println("The entered yr is a leap year");
					}else{
						System.out.println("The entered yr is not a leap year");
					}
				}else{
						System.out.println("The entered yr is a leap year");
					}
			}else{
						System.out.println("The entered yr is not a leap year");
					}
				
					
				
			}	
		}
		
	}
}