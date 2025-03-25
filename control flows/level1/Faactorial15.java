import java.util.Scanner;

public class Faactorial15{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=1;
		if(n<0){
			System.out.println("Enter a positive number");
	
		} for(int i=n;i>0;i--){
			
			sum=sum*i;
		}
		
		
		System.out.println("Factorial is "+sum);
			
		
	}
}