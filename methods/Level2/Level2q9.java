import java.util.Scanner;
public class Level2q9{
	public static int compare(int a,int b){
		if (a>b){
			return 1;
		}
		else if (b>a){
			return -1;
		}
		else{
			return 1;
		}
	}
	public static void isEven(int number){
		if (number%2==0){
			System.out.println(number+" is even number");
		}
		else{
			System.out.println(number+" is odd number");
		}
	}
	public static void isPositive(int num){
		if (num>=0){
			System.out.println(num+" is Positive");
			Level2q9.isEven(num);
		}
		else{
			System.out.println(num+" is Negative");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];
		for (int i=0;i<5;i++){
			System.out.println("Enter a number :");
			arr[i]=input.nextInt();
		}
		for (int i=0;i<5;i++){
			Level2q9.isPositive(arr[i]);
		}
		int result=Level2q9.compare(arr[0],arr[1]);
		System.out.println(result);
	}
}
		
			