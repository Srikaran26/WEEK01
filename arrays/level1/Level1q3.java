import java.util.Scanner;

public class Level1q3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[10];
		
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		
		for(int i=1;i<=10;i++){
			arr[i-1]=number*i;
			
		}
		for(int i=0;i<10;i++){
			System.out.println(number+"*"+(i+1)+"="+arr[i]);
		}
		
	}
}