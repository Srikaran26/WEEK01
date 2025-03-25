import java.util.Scanner;

public class oddeven16{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		if(n<=0){
			
			System.out.println("Enter a natural number");
		}else{
			System.out.println("Odd numbers are");
			for(int i=1; i<n+1;i=i+2){
				
				System.out.println(i);
			}
			System.out.println("Even numbers are");
			for(int i=2; i<n+1;i=i+2){
				
				System.out.println(i);
			}
		}
		
	}
}