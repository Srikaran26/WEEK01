import java.util.Scanner;

public class Level1q7{
	public static int Sum(int n){
		int sum=0;
		for(int i=0;i<=n;i++){
			sum=sum+i;
			
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scanner.nextInt();
		
		int result=Sum(n);
		System.out.println("sum of "+n+" natural numbers is "+result);
		scanner.close();
		
	}
}