import java.util.Scanner;
public class Level1q8{
	public static int findSmallestAndLargest(int number1, int number2, int number3){
		if(number1>number2 && number1>number3){
			return number1;
		}else if(number2>number1 && number2>number3){
			return number2;
		}else{
			return number3;
		}
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1=scanner.nextInt();
		System.out.println("Enter 1st number: ");
		int n2=scanner.nextInt();
		System.out.println("Enter 1st number: ");
		int n3=scanner.nextInt();
		
		int result=findSmallestAndLargest(n1,n2,n3);
		System.out.println(result+" is greater");
		scanner.close();
		
	}
}