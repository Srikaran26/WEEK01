import java.util.Scanner;

public class Level1q3{
	
		
	static void Hs(int n){
		
		int hs=(n*(n-1))/2;
		System.out.println("Total handshakes are: "+ hs);
		return;
	}
	

	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of students: ");
		int n=scanner.nextInt();
		
		Hs(n);
		scanner.close();
	}
}	 